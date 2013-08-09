package com.github.dtf.rpc.client;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.github.dtf.conf.Configuration;
import com.github.dtf.protocol.TaskUmbilicalProtocol;
import com.github.dtf.security.UserGroupInformation;

public class MockClient {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Client cli = new Client(null, null);
		InetSocketAddress addr = new InetSocketAddress("localhost", 2233);
		UserGroupInformation ticket = new UserGroupInformation();
		Configuration conf = new Configuration();
		TestParam param = new TestParam();
		cli.call(param, addr, TaskUmbilicalProtocol.class, ticket, 10000, conf);
	}
}
