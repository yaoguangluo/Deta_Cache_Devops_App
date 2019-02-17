package org.cache.devops.getCacheInfo;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class CacheInfoNodeRun extends objectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public CacheInfoNodeRun( ) throws IOException{	
	}
	public void run(final CacheInfoNodeView thisview) throws IOException{
		System.out.println("runed" + value); 
		System.out.println(toptablein.getModel().getValueAt(0, 0));
		System.out.println("runed" + value);
	
		System.out.println("畠何頼撹。。。。。。。。");  	  
		thisview.tableout=toptablein;
		//thisview.out=new JTable(content,spec); 	
	}
}
