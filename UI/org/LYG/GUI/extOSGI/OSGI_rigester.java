package org.LYG.GUI.extOSGI;
import java.io.IOException;

import org.LYG.GUI.OSGI.*;
import org.LYG.node.ai.arffTransfer.arffTransferNodeInterface;

public class OSGI_rigester{
	public OSGI_rigester(){
	}
	public nodeOSGI Rigester(nodeOSGI first, linkOSGI link) throws IOException{
		//ע��
	
		//
		objectInterface arffTransferNode = new arffTransferNodeInterface();
		first = link.addNode(first,arffTransferNode);
		
		return first;	
	}
	
}