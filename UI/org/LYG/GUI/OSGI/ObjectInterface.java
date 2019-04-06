package org.LYG.GUI.OSGI;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
public class ObjectInterface implements Cloneable{
	public ImageIcon thisicon;
	public Image thisimage;
	public String thisname;
	public String position; 
	public ObjectPanel thispanel;
	public ObjectRun thisrun;
	public ObjectView thisview;
	public ObjectInterface stu;
	public boolean showed=false;
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException  {
		return stu;   
	}
	public ObjectInterface(){
		thisicon=null;
		thisimage=null;
		thisname=null;
		thispanel=new ObjectPanel();
		thisrun=new ObjectRun();
		thisview=new ObjectView();	
	}
	public void config() throws IOException{
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException, InterruptedException{
	}
	public void view() throws Exception{
	}
}
