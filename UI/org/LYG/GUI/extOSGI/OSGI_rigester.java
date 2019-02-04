package org.LYG.GUI.extOSGI;
import java.io.IOException;

import org.LYG.GUI.OSGI.*;
import org.LYG.node.ai.arffTransfer.arffTransferNodeInterface;

public class OSGI_rigester{
	public OSGI_rigester(){
	}
	public nodeOSGI Rigester(nodeOSGI first, linkOSGI link) throws IOException{
		//注册
	
		//
		objectInterface arffTransferNode = new arffTransferNodeInterface();
		first = link.addNode(first,arffTransferNode);
		
//		以后写了新节点 就
//		objectInterface 运维第一个Node = new 运维第一个NodeInterface();
//		first = link.addNode(first， 运维第一个Nod);
		
		return first;	
	}
	
}