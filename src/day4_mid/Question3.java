/**
 * 
 */
package day4_mid;

import java.awt.Dimension;

/**
 * @author lamhotjmsiagian
 *
 */
public class Question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension d = new Dimension(5,10);
		Question3 rt = new Question3();
		System.out.println("Before modify() d.height= "+ d.height);
		rt.modify(d);
		System.out.println("After modify() d.height= "+ d.height);
	}
	
	void modify(Dimension dim)
	{
		dim.height= dim.height+1;
		System.out.println("Dim = " + dim.height);
	}

}
