package com.github.dtf.rpc.server;

import java.util.List;


public interface Server {
	
	
	public boolean isRunning();

	public List<Connection> getConnectionList();

	public void closeConnection(Connection c);
}
