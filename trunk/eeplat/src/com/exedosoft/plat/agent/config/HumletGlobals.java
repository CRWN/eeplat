package com.exedosoft.plat.agent.config;

/**
 * n?ISΗzuφB οAgent?sIn¬C[ϋB
 * @author  Administrator
 */

public class HumletGlobals {

	/**
	 * ?νΌΜ
	 * @uml.property  name="serverName"
	 */
	private static String serverName;

	/**
	 * ?ν[ϋ
	 * @uml.property  name="port"
	 */
	private static String port;

	/**
	 * CommanSerlet?ν\ΪσIΕεq?[??ρ?xB
	 * @uml.property  name="cmdSvrBlockMax"
	 */
	private static String cmdSvrBlockMax;
	
	/**
	 * inpool Εε?ρ?x
	 * @uml.property  name="inQueueMax"
	 */
	private static String inQueueMax;
	
	/**
	 * Ε½?IΑ§
	 * @uml.property  name="processMax"
	 */
	private static String processMax;	
		
	/**
	 * q?[?Ϊ΄???B
	 * @uml.property  name="timeOut"
	 */
	private static String timeOut;

	static {

		serverName = "127.0.0.1";
		port = "315";
		timeOut = "1000";
		cmdSvrBlockMax = "10";
		processMax = "10";
	}

	/**
	 * @return
	 * @uml.property  name="serverName"
	 */
	public static String getServerName() {
		return serverName;
	}

	/**
	 * @return
	 * @uml.property  name="port"
	 */
	public static int getPort() {
		return Integer.parseInt(port);
	}

	/**
	 * @return
	 * @uml.property  name="timeOut"
	 */
	public static int getTimeOut() {
		return Integer.parseInt(timeOut);
	}
	
	/**
	 * @return
	 * @uml.property  name="cmdSvrBlockMax"
	 */
	public static int getCmdSvrBlockMax(){
		return Integer.parseInt(cmdSvrBlockMax);		
	}

	/**
	 * @return
	 * @uml.property  name="processMax"
	 */
	public static int getProcessMax() {
		return Integer.parseInt(processMax);
	}
	
	/**
	 * @return
	 * @uml.property  name="inQueueMax"
	 */
	public static int getInQueueMax(){
		return Integer.parseInt(inQueueMax);
	}

	
	

}
