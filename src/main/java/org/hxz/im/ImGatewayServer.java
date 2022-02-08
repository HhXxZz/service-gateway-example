package org.hxz.im;


import io.netty.channel.ChannelPipeline;
import org.hxz.service.frameworks.base.BaseServer;
import org.hxz.service.frameworks.misc.Config;
import org.hxz.service.frameworks.rpc.common.ServiceInfo;
import org.hxz.service.frameworks.rpc.nacos.NacosManager;
import org.hxz.service.frameworks.rpc.server.BaseRpcServer;
import org.hxz.service.frameworks.utils.GsonUtil;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hxz on 2021/11/1 15:02.
 */

public class ImGatewayServer extends BaseServer {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ImGatewayServer.class);
        application.run(args);

        ImGatewayServer server = new ImGatewayServer();
        server.start();

    }

    @Override
    protected void init() {

    }

    @Override
    protected void initCustomChannel(ChannelPipeline channelPipeline) {

    }


    @Override
    protected void release() {
    }

}
