import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class rarcgame extends JFrame implements ActionListener
{

	JFrame f;
	ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JButton b1,b2;
	Timer tm,ta,tr,tg,ty,tb,tf;

	int arrx=143,arry=84,arrw=119,arrh=24, rx=930,ry=550,rw=75,rh=100,gx=1045,gy=550,gw=75,gh=100,yx=1160,yy=550,yw=75,yh=100,bx=1275,by=550,bw=75,bh=100,red=1,green=1,yellow=1,blue=1,count=0;
	
	int  brx=0,bry=0,brw=0,brh=0,bgx=0,bgy=0,bgw=0,bgh=0,byx=0,byy=0,byw=0,byh=0,bbx=0,bby=0,bbw=0,bbh=0;
	
	public rarcgame()
	{

		f=new JFrame("Archery Game");
		i1=new ImageIcon("arrowman.jpg");
		i2=new ImageIcon("arrow.jpg");
		i3=new ImageIcon("red.jpg");
		i4=new ImageIcon("green.jpg");
		i5=new ImageIcon("yellow.jpg");
		i6=new ImageIcon("blue.jpg");
		i7=new ImageIcon("redblast.jpg");
		i8=new ImageIcon("greenblast.jpg");
		i9=new ImageIcon("yellowblast.jpg");
		i10=new ImageIcon("blueblast.jpg");
		i11=new ImageIcon("finish.jpg");
	
		l1=new JLabel(i1);
		l1.setBounds(50,50,93,102);
		l2=new JLabel(i2);
		l2.setBounds(arrx,arry,arrw,arrh);
		l2.setVisible(false);
		l3=new JLabel(i3);
		l3.setBounds(rx,ry,rw,rh);
		l4=new JLabel(i4);
		l4.setBounds(gx,gy,gw,gh);
		l5=new JLabel(i5);
		l5.setBounds(yx,yy,yw,yh);
		l6=new JLabel(i6);
		l6.setBounds(bx,by,bw,bh);
		l7=new JLabel(i7);
		l7.setVisible(false);
		l8=new JLabel(i8);
		l8.setVisible(false);
		l9=new JLabel(i9);
		l9.setVisible(false);
		l10=new JLabel(i10);
		l10.setVisible(false);
		l11=new JLabel(i11);
		l11.setVisible(false);
		l11.setBounds(930,300,749,311);
		ActionListener lis1 = new ActionListener()
		{	
			public void actionPerformed(ActionEvent ae)
			{	
				if(ry+rh<0)
					ry=760;
				if(gy+gh<0)
					gy=760;
				if(by+bh<0)
					by=760;
				if(yy+yh<0)
					yy=760;
				ry=ry-5;
				gy=gy-4;
				yy=yy-3;
				by=by-2;
										
				l3.setBounds(rx,ry,rw,rh);
				l4.setBounds(gx,gy,gw,gh);
				l5.setBounds(yx,yy,yw,yh);
				l6.setBounds(bx,by,bw,bh);
			}
		};
	
		tm=new Timer(25,lis1);
		tm.start();

		b1=new JButton("Shoot");
		b1.setBounds(50,500,80,40);
		b1.addActionListener(this);
		b2=new JButton("Exit");
		b2.setBounds(50,600,80,40);
		b2.addActionListener(this);

		f.setLayout(null);
		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.setSize(1366,760);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==b1)
		{
			shoot();
			
		}	
			

		if(ae.getSource()==b2)
			System.exit(0);
	}


	public void shoot()
	{
		ActionListener lis2 = new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				l2.setVisible(true);
				b1.setVisible(false);
				if(arrx<1380)
				{
					l2.setBounds(arrx,arry,arrw,arrh);
					arrx=arrx+5;
					if(red==1)
					{
					if(arrx+arrw>=930 && arrx<=1005 && ry<=84 && ry+rh>=108)
					{
						count++;
						l3.setVisible(false);
						l3.setBounds(0,780,1,1);
						brx=rx;
						bry=ry;
						brw=rw;
						brh=rh;
						l7.setBounds(brx,bry,brw,brh);
						l7.setVisible(true);
						red=0;
						ActionListener lisr=new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{
								if(bry>650)
								{
									l7.setBounds(930,600,75,100);
								   	tr.stop();
								}
								else
								{
									bry=bry+8;
									l7.setBounds(brx,bry,brw,brh);
									
								}
							}
						};
						tr=new Timer(100,lisr);
						tr.start();	
					}
					}
					if(green==1)
					{
					if(arrx+arrw>=1045 && arrx<=1120 && gy<=84 && gy+gh>=108)
					{
						count++;
						l4.setVisible(false);
						l4.setBounds(0,780,1,1);
						bgx=gx;
						bgy=gy;
						bgw=gw;
						bgh=gh;
						l8.setBounds(bgx,bgy,bgw,bgh);
						l8.setVisible(true);
						green=0;
						ActionListener lisg=new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{
								if(bgy>650)
								{
									l8.setBounds(1045,600,75,100);
								   	tg.stop();
								}
								else
								{
									bgy=bgy+8;
									l8.setBounds(bgx,bgy,bgw,bgh);
									
								}
							}
						};
						tg=new Timer(100,lisg);
						tg.start();
					}}
					if(yellow==1)
					{
					if(arrx+arrw>=1160 && arrx<=1235 && yy<=84 && yy+yh>=108)
					{
						count++;
						l5.setVisible(false);
						l5.setBounds(0,780,1,1);
						byx=yx;
						byy=yy;
						byw=yw;
						byh=yh;
						l9.setBounds(byx,byy,byw,byh);
						l9.setVisible(true);
						yellow=0;
						ActionListener lisy=new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{
								if(byy>650)
								{
									l9.setBounds(1160,600,75,100);
								   	ty.stop();
								}
								else
								{
									byy=byy+8;
									l9.setBounds(byx,byy,byw,byh);
									
								}
							}
						};
						ty=new Timer(100,lisy);
						ty.start();
					}}
					if(blue==1)
					{
					if(arrx+arrw>=1275 && arrx<=1350 && by<=84 && by+bh>=108)
					{
						count++;
						l6.setVisible(false);
						l6.setBounds(0,780,1,1);
						bbx=bx;
						bby=by;
						bbw=bw;
						bbh=bh;
						l10.setBounds(bbx,bby,bbw,bbh);
						l10.setVisible(true);
						blue=0;
						ActionListener lisb=new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{
								if(bby>650)
								{
									l10.setBounds(1275,600,75,100);
								   	tb.stop();
								}
								else
								{
									bby=bby+8;
									l10.setBounds(bbx,bby,bbw,bbh);
									
								}
							}
						};
						tb=new Timer(100,lisb);
						tb.start();
					}}
				}
				else
				{
					ta.stop();
					arrx=143;
					b1.setVisible(true);
				}
			}
		};
		ta=new Timer(15,lis2);
		ta.start();	
	
		if(yellow==0 && green==0 && blue==0 && red==0)
		{
	
			b1.setVisible(false);
			l11.setVisible(true);
			
		}

	}

	public static void main(String[] args)
	{

		new rarcgame();
	}

}
		