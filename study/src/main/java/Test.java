import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class Test {
        public static void waitUntilConnected(ZooKeeper testZooKeeper, CountDownLatch testLatch) {
               if(testZooKeeper.getState() == ZooKeeper.States.CONNECTING) {
                       try {
                               testLatch.await();
                       } catch (InterruptedException err) {
                               System.out.println("Latch exception");
                       }
               }
       }

       static class ConnectedWatcher implements Watcher {
               private CountDownLatch connectedLatch;

               ConnectedWatcher(CountDownLatch connectedLatch) {

                       this.connectedLatch = connectedLatch;   /* CountDownLatch实例初始化时设为1即可 */

               }

               @Override
               public void process(WatchedEvent event) {

                       if (event.getState() == Event.KeeperState.SyncConnected) {

                               connectedLatch.countDown(); /* ZK连接成功时，计数器由1减为0 */

                       }
               }
       }

       public static void main(String args[]) throws IOException, KeeperException, InterruptedException {

                       CountDownLatch sampleLatch = new CountDownLatch(1);
                       Watcher sampleWatcher = new ConnectedWatcher (sampleLatch);
                       ZooKeeper zk = new ZooKeeper("192.168.111.135:2181", 30, sampleWatcher);
                        System.out.println(123);
                       waitUntilConnected(zk, sampleLatch);       /* 只有当ZK链接成功（状态为 SyncConnected)时，此函数调用才结束 */
                       /*接下来就可以继续ZK访问了，避免因为ZK未连接成功时的访问出错 */

                         //设置/root节点的数据，版本号为-1，如果匹配不到相应的节点，会抛出异常
                        zk.setData("/","hello".getBytes(),-1);
                        System.out.println(123);
                        //取得/root节点的数据，并反回其stat
                        Stat stat = new Stat();
                        byte[] data = zk.getData("/",false,stat);
           System.out.println(new String(data));


       }

}
