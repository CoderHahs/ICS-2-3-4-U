import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

/*
This game was made by Hrithik Shah in course ICS208 (2015, Ms.Gorski)
All rights to this game are owned by the Yugioh Corporation (KONAMI)
All code is owned by Hrithik Shah
Pictures used in this game are owned by the Yugioh Corporation too.
The pictures used in-game were taken from http://www.duelingnetwork.com/

Special Thanks To:
Yathin and Saksham for fixing bugs
and Ms.Gorski too.
*/

public class YUGIOH extends Applet implements ActionListener
{
	// to do: code the 4 phase buttons
	// code card effects
	// finish selecting cards
	// gameplay meaning figuring out player turns.
	// get the descriptions working for the cards
	//
	//
	// LAYOUT HAS TO BE IN ORDER
	// *******KEEP THAT FOR THE END********* very difficult
	
	Panel p_card;  //to hold all of the screens
	Panel card1, card2, card3, card4, card5; //the two screens
	CardLayout cdLayout = new CardLayout ();
	int row = 4;
	JButton m[] = new JButton [5];
	JButton grave;
	JButton s[] = new JButton [5];
	JButton deck;
	JButton h[] = new JButton [5];
	JButton m2[] = new JButton [5];
	JButton grave2;
	JButton s2[] = new JButton [5];
	JButton deck2;
	JButton hand2[] = new JButton [5];
	JButton opponentm1[] = new JButton [5];
	JButton opponents1[] = new JButton [5];
	JButton opponentm2[] = new JButton [5];
	JButton opponents2[] = new JButton [5];
	JLabel largecard, largecard2;
	JTextArea cd, cd2;
	int h1 = 0;
	int h2 = 0;
	int h3 = 0;
	int h4 = 0;
	int h5 = 0;
	int h1v2 = 0;
	int h2v2 = 0;
	int h3v2 = 0;
	int h4v2 = 0;
	int h5v2 = 0;
	//main variables for each card.
	int deck1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	int deckp2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	int level[] = {3, 8, 7, 4, 4, 4, 5, 3, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int level2[] = {3, 8, 7, 4, 4, 4, 5, 3, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int attack[] = {1200, 3000, 2500, 800, 1500, 1400, 1800, 1300, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int attack2[] = {1200, 3000, 2500, 800, 1500, 1400, 1800, 1300, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int defense[] = {700, 2500, 2100, 2000, 1200, 1200, 1300, 2000, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int defense2[] = {700, 2500, 2100, 2000, 1200, 1200, 1300, 2000, 1200, 1800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	String activate = "No";
	boolean dead[] = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
	boolean dead2[] = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
	String description []= {"Much more than just a child, \nthis dragon is gifted with untapped power.","This legendary dragon is a \npowerful engine of destruction. Virtually invincible, very few have faced \nthis awesome creature and lived to tell the tale.","The ultimate wizard in terms of attack and defense.", "A delicate elf that lacks offense, but has a \nterrific defense backed by mystical power.","A vicious, fire-breathing dragon whose \nwicked flame corrupts the souls of its victims.","An elf who learned to wield a sword, \nhe baffles enemies with lightning-swift attacks.","A bull monster often found in the woods, \nit charges enemy monsters with a pair of deadly horns.","A giant warrior made of stone. A punch from \nthis creature has earth-shaking results","A mammoth that protects the graves of its pack and is \nabsolutely merciless when facing grave-robbers.","A genie of the lamp that is at \nthe beck and call of its master.","Target one monster your opponent controls; take control of it until the End Phase.", "This card remains on the field for 3 of your opponent's turns. \nWhile this card is face-up on the field, monster(s) your opponent \ncontrols cannot declare an attack.","Destroy all cards on the field.","Draw 2 cards.","Pay 800 LP, then target 1 face-up \nmonster your opponent controls; take control \nof that target until the End Phase.","Increase your Life Points by 1000 points.","Destroy all face-up monsters your opponent controls.", "You can conduct 2 Normal Summons/Sets this turn, not just 1.","Discard 5 cards from your hand. Destroy all cards on the field.","Destroy the 1 face-up monster your opponent controls that has the lowest ATK."};
	
	int t = 20;
	int t2 = 20;
	JLabel cardsleft;
	JLabel cardsleft2;
	
	int i = 0;
	int i2 = 0;
	
	int d[] = new int [20];
	int d2[] = new int [20];
	
	int cardtochange;
	int spottoerase;
	boolean nocard;
	boolean nocardm[] = {true, true, true, true, true};
	boolean nocardf[] = {true, true, true, true, true};
	boolean nocard2;
	boolean nocardm2[] = {true, true, true, true, true};
	boolean nocardf2[] = {true, true, true, true, true};
	String sors[] = {"Summon", "Set"};
	String ws;
	int atkordef[] = new int [20];
	int atkordef2[] = new int [20];
	
	int mon[] = new int [20];
	int spe[] = new int [20];
	int mon2[] = new int [20];
	int spe2[] = new int [20];
	
	JButton phase[] = new JButton [4];
	JButton phase2[] = new JButton [4];
	boolean draw, main, battle, end;
	boolean active = false;
	boolean atkactive = false;
	boolean oatkactive = false;
	
	int firstturn = 0;
	int firstturn2 = 0;
	boolean player1turn = true;
	boolean player2turn = false;
	String endturn;
	String yesorno[] = {"Yes", "No"};
	
	int x, x2;
	
	int lifepointp1 = 4000;
	int lifepointp2 = 4000;
	JLabel LP, LP2, LP3, LP4;
	
	String tribute = "No";
	int tbcounter = 0;
	int tbcounter2 = 0;
	String xh = "anything";
	
	JLabel step;
	int n = 1;
	
	int summon = 0;
	boolean atktrue[] = {false, false, false, false, false};
	boolean atktrue2[] = {false, false, false, false, false};
	int nmonsters = 0;
	int nmonsters2 = 0;
	
	int monvalue1;
	int monvalue2;
	int sendgravep1;
	int sendgravep2;
	
	int cardtoactivate = 0;
	boolean notviewable;
	boolean over;
	
	
	
	
	public void init ()
	{
		p_card = new Panel ();
		p_card.setLayout (cdLayout);
		screen1 ();
		screen2 ();
		screen3 ();
		screen4 ();
		screen5 ();
		resize (1366, 768);
		setLayout (new BorderLayout ());
		add ("Center", p_card);
	}
	
	
	
	public void draw ()
	{
		draw = true;
		main = false;
		battle = false;
		end = false;
		
		if (player1turn == true)
		{
			phase [0].setEnabled (false);
			phase [1].setEnabled (true);
			phase [2].setEnabled (false);
			phase [3].setEnabled (false);
		}
		
		
		else
		{
			phase2 [0].setEnabled (false);
			phase2 [1].setEnabled (true);
			phase2 [2].setEnabled (false);
			phase2 [3].setEnabled (false);
		}
		
		
		// also: if number of cards in hand = 5, then drawing a card should be disabled.
		// to do: let player know it is the draw phase (textbox). put all the buttons in the for loop and disable the ones not needed in this step. First - have a pop up box that shows on the screen telling the player to draw a card. Then once 1 card is drawn disable the deck button so that player cannot draw for rest of turn.
		if (player1turn == true)
		{
			if (h1 == 1 && h2 == 1 && h3 == 1 && h4 == 1 && h5 == 1)
			{
				deck.setEnabled (false);
				JOptionPane.showMessageDialog (null, "Player 1: 5 card limit in hand reached.", "Draw Phase", JOptionPane.ERROR_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog (null, "Player 1: Please draw a card.", "Draw Phase", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		else
		{
			if (h1v2 == 1 && h2v2 == 1 && h3v2 == 1 && h4v2 == 1 && h5v2 == 1)
			{
				deck2.setEnabled (false);
				JOptionPane.showMessageDialog (null, "Player 2: 5 card limit in hand reached.", "Draw Phase", JOptionPane.ERROR_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog (null, "Player 2: Please draw a card.", "Draw Phase", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		for (int i = 0 ; i < 5 ; i++)
		{
			m [i].setEnabled (false);
			grave.setEnabled (false);
			s [i].setEnabled (false);
			m2 [i].setEnabled (false);
			grave2.setEnabled (false);
			s2 [i].setEnabled (false);
			if (t > 0 && h1 != 1 && h2 != 1 && h3 != 1 && h4 != 1 && h5 != 1)
				deck.setEnabled (true);
			else if (t2 > 0 && h1v2 != 1 && h2v2 != 1 && h3v2 != 1 && h4v2 != 1 && h5v2 != 1)
				deck2.setEnabled (true);
		}
	}
	
	
	public void main ()
	{
		// only let player summon or set here.
		// to do: let the player know it is the main phase (textbox). disable the deck button (so players cannot draw a card), add feature where player can activate a card or effect and change the battle position of a card.
		main = true;
		draw = false;
		battle = false;
		end = false;
		
		deck.setEnabled (false);
		deck2.setEnabled (false);
		
		if (player1turn == true)
		{
			phase [0].setEnabled (false);
			phase [1].setEnabled (false);
			phase [2].setEnabled (true);
			phase [3].setEnabled (false);
			if (firstturn != 2)
				phase [3].setEnabled (true);
		}
		
		
		else
		{
			phase2 [0].setEnabled (false);
			phase2 [1].setEnabled (false);
			phase2 [2].setEnabled (true);
			phase2 [3].setEnabled (false);
			if (firstturn2 != 2)
				phase2 [3].setEnabled (true);
		}
		
		
		if (countersrl < 4 && swordsofrevealinglight == true)
		{
			for (int i = 0 ; i < 5 ; i++)
			{
				m [i].setEnabled (true);
				m [sendgravep2].setEnabled (false);
				grave.setEnabled (true);
				s [i].setEnabled (true);
				m2 [i].setEnabled (true);
				m2 [sendgravep1].setEnabled (false);
				grave2.setEnabled (true);
				s2 [i].setEnabled (true);
			}
			countersrl++;
		}
		
		
		else
		{
			swordsofrevealinglight = false;
			for (int i = 0 ; i < 5 ; i++)
			{
				m [i].setEnabled (true);
				grave.setEnabled (true);
				s [i].setEnabled (true);
				m2 [i].setEnabled (true);
				grave2.setEnabled (true);
				s2 [i].setEnabled (true);
			}
		}
		
		
		
	}
	
	
	int battleactive = 0;
	public void battle ()
	{
		// to do: add feature where player, whenever he click on a monster card, battle option is shown. In hand only spell cards should show activate option, whereas all cards in the s/t zone have the activate option. damage has to be calculated.
		
		battleactive++;
		
		int damage = 0;
		battle = true;
		draw = false;
		main = false;
		end = false;
		
		if (player1turn == true)
		{
			phase [0].setEnabled (false);
			phase [1].setEnabled (false);
			phase [2].setEnabled (false);
			phase [3].setEnabled (true);
		}
		
		
		else
		{
			phase2 [0].setEnabled (false);
			phase2 [1].setEnabled (false);
			phase2 [2].setEnabled (false);
			phase2 [3].setEnabled (true);
		}
		
		
		
		if (player1turn == true)
		{
			if (firstturn == 2)
			{
				JOptionPane.showMessageDialog (null, "Sorry cannot attack on first turn.", "Cannot attack", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true)
			{
				// if no monsters on opponents field.
				if (active == false)
					JOptionPane.showMessageDialog (null, "There are no monsters on your opponents side of the field. \nA direct attack will be performed \nPlease select which monsters you would like to attack with.", "Direct attack", JOptionPane.INFORMATION_MESSAGE);
				else
				{
					damage = 0;
					if (atktrue [0] == true)
					{
						damage += attack [mon [0]];
						m [0].setEnabled (false);
					}
					if (atktrue [1] == true)
					{
						damage += attack [mon [1]];
						m [1].setEnabled (false);
					}
					if (atktrue [2] == true)
					{
						damage += attack [mon [2]];
						m [2].setEnabled (false);
					}
					if (atktrue [3] == true)
					{
						damage += attack [mon [3]];
						m [3].setEnabled (false);
					}
					if (atktrue [4] == true)
					{
						damage += attack [mon [4]];
						m [4].setEnabled (false);
					}
					lifepointp2 -= damage;
					
				}
				
			}
			else
			{
				// if 1 or more monsters on opponents field.
				if (nmonsters2 >= 1)
				{
					if (atkactive == false)
						JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack with.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
					else
					{
						if (oatkactive == false)
							JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
						else
						{
							atkactive = false;
							oatkactive = false;
							int mon1 = monvalue1;
							int mon2 = monvalue2;
							if (atkordef [sendgravep1] == 1 && atkordef2 [sendgravep2] == 1)
							{
								// attack monster vs. attack monster.
								int atk1 = attack [mon1];
								int atk2 = attack2 [mon2];
								if (atk1 >= atk2)
								{
									damage = atk1 - atk2;
									dead2 [mon2] = true;
									m2 [sendgravep2].setIcon (null);
									opponentm1 [sendgravep2].setIcon (null);
									nocardm2 [sendgravep2] = true;
									m [sendgravep1].setEnabled (false);
									lifepointp2 -= damage;
								}
								
								else
								{
									damage = atk2 - atk1;
									m [sendgravep1].setIcon (null);
									opponentm2 [sendgravep1].setIcon (null);
									nocardm [sendgravep1] = true;
									m [sendgravep1].setEnabled (false);
									lifepointp1 -= damage;
								}
								
							}
							else if (atkordef [sendgravep1] == 1 && atkordef2 [sendgravep2] == 0)
							{
								// attack monster vs. defense monster.
								int atk1 = attack [mon1];
								int def2 = defense2 [mon2];
								if (atk1 > def2)
								{
									dead2 [mon2] = true;
									m2 [sendgravep2].setIcon (null);
									opponentm1 [sendgravep2].setIcon (null);
									nocardm2 [sendgravep2] = true;
									m [sendgravep1].setEnabled (false);
									lifepointp2 -= damage;
								}
								else if (atk1 < def2)
								{
									damage = def2 - atk1;
									m [sendgravep1].setIcon (null);
									opponentm2 [sendgravep1].setIcon (null);
									nocardm [sendgravep1] = true;
									m [sendgravep1].setEnabled (false);
									lifepointp1 -= damage;
								}
							}
							
						}
						
						if (lifepointp2 < 0)
						{
							LP2.setText ("Life Points left: 0");
							LP3.setText ("Life Points left: 0");
						}
						else
						{
							LP2.setText ("Life Points left: " + lifepointp2);
							LP3.setText ("Life Points left: " + lifepointp2);
							
						}
						firstturn = 3;
						active = false;
						
					}
				}
				
			}
		}
		else
		{
			if (firstturn2 == 2)
				JOptionPane.showMessageDialog (null, "Sorry cannot attack on first turn.", "Cannot attack", JOptionPane.INFORMATION_MESSAGE);
			else if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true)
			{
				// if no monsters on opponent's field
				if (active == false)
					JOptionPane.showMessageDialog (null, "There are no monsters on your opponents side of the field. \nA direct attack will be performed \nPlease select which monsters you would like to attack with.", "Direct attack", JOptionPane.INFORMATION_MESSAGE);
				else
				{
					damage = 0;
					if (atktrue2 [0] == true)
					{
						damage += attack2 [mon2 [0]];
						m2 [0].setEnabled (false);
					}
					if (atktrue2 [1] == true)
					{
						damage += attack2 [mon2 [1]];
						m2 [1].setEnabled (false);
					}
					if (atktrue2 [2] == true)
					{
						damage += attack2 [mon2 [2]];
						m2 [2].setEnabled (false);
					}
					if (atktrue2 [3] == true)
					{
						damage += attack2 [mon2 [3]];
						m2 [3].setEnabled (false);
					}
					if (atktrue2 [4] == true)
					{
						damage += attack2 [mon2 [4]];
						m2 [4].setEnabled (false);
					}
					lifepointp1 -= damage;
				}
				
				
			}
			else
			{
				// if 1 or more monsters on opponent's field.
				if (nmonsters >= 1)
				{
					if (atkactive == false)
						JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack with.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
					else
					{
						if (oatkactive == false)
							JOptionPane.showMessageDialog (null, "Please select the monster you would like to attack.", "Monster Attack", JOptionPane.INFORMATION_MESSAGE);
						else
						{
							atkactive = false;
							oatkactive = false;
							int mon1 = monvalue1;
							int mon2 = monvalue2;
							if (atkordef2 [sendgravep2] == 1 && atkordef [sendgravep1] == 1)
							{
								// attack monster vs. attack monster
								int atk1 = attack2 [mon1];
								int atk2 = attack [mon2];
								if (atk1 > atk2)
								{
									damage = atk1 - atk2;
									dead [mon2] = true;
									m [sendgravep1].setIcon (null);
									opponentm2 [sendgravep1].setIcon (null);
									nocardm [sendgravep1] = true;
									m2 [sendgravep2].setEnabled (false);
									lifepointp1 -= damage;
								}
								else if (atk1 < atk2)
								{
									damage = atk2 - atk1;
									m2 [sendgravep1].setIcon (null);
									opponentm1 [sendgravep1].setIcon (null);
									nocardm2 [sendgravep1] = true;
									m2 [sendgravep1].setEnabled (false);
									lifepointp2 -= damage;
								}
								
							}
							else if (atkordef2 [sendgravep2] == 1 && atkordef [sendgravep1] == 0)
							{
								// attack monster vs. defense monster.
								int atk1 = attack2 [mon1];
								int def2 = defense [mon2];
								if (atk1 > def2)
								{
									dead2 [mon2] = true;
									m [sendgravep2].setIcon (null);
									opponentm2 [sendgravep2].setIcon (null);
									nocardm [sendgravep2] = true;
									m2 [sendgravep1].setEnabled (false);
								}
								else if (atk1 < def2)
								{
									damage = def2 - atk1;
									m2 [sendgravep1].setIcon (null);
									opponentm1 [sendgravep1].setIcon (null);
									nocardm2 [sendgravep1] = true;
									m2 [sendgravep1].setEnabled (false);
								}
								lifepointp2 -= damage;
							}
						}
						if (lifepointp1 < 0)
						{
							LP4.setText ("Life Points left: 0");
							LP.setText ("Life Points left: 0");
						}
						else
						{
							LP4.setText ("Life Points left: " + lifepointp1);
							LP.setText ("Life Points left: " + lifepointp1);
							
						}
						firstturn2 = 3;
					}
				}
			}
		}
	}
	
	
	
	public void graveyard ()
	{
		// when clicks should show screen with all cards in the graveyard.
		// not an added feature.
	}
	
	
	public void end ()
	{
		end = true;
		draw = false;
		main = false;
		battle = false;
		
		summon = 0;
		
		for (int i = 0 ; i < 5 ; i++)
		{
			m [i].setEnabled (false);
			grave.setEnabled (false);
			s [i].setEnabled (false);
			m2 [i].setEnabled (false);
			grave2.setEnabled (false);
			s2 [i].setEnabled (false);
		}
		
		
		// to do: change turn to opponent.
		if (player1turn == true)
		{
			endturn = (String) JOptionPane.showInputDialog (null, "Player 1: \nAre you sure you want to end your turn?", "End Turn?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
			if (endturn.equals ("Yes"))
			{
				if (changeofheart == true)
				{
					over = true;
					changeofheart ();
				}
				else if (braincontrol == true)
				{
					over = true;
					braincontrol ();
				}
				cdLayout.show (p_card, "4");
				player1turn = false;
				player2turn = true;
				phase2 [0].setEnabled (true);
				phase2 [1].setEnabled (false);
				phase2 [2].setEnabled (false);
				phase2 [3].setEnabled (false);
				if (firstturn2 != 0)
					deck2.setEnabled (false);
				
				if (lifepointp2 < 0 || lifepointp1 < 0 || t <= 0 || t2 <= 0)
				{
					JOptionPane.showMessageDialog (null, "Congratulations. You won!", "You win!", JOptionPane.INFORMATION_MESSAGE);
					cdLayout.show (p_card, "1");
					screen3 ();
					screen4 ();
				}
			}
		}
		
		
		else
		{
			endturn = (String) JOptionPane.showInputDialog (null, "Player 2: \nAre you sure you want to end your turn?", "End Turn?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
			if (endturn.equals ("Yes"))
			{
				if (changeofheart == true)
				{
					over = true;
					changeofheart ();
				}
				else if (braincontrol == true)
				{
					over = true;
					braincontrol ();
				}
				cdLayout.show (p_card, "3");
				player2turn = false;
				player1turn = true;
				phase [0].setEnabled (true);
				phase [1].setEnabled (false);
				phase [2].setEnabled (false);
				phase [3].setEnabled (false);
				deck.setEnabled (false);
				if (lifepointp2 < 0 || lifepointp1 < 0 || t <= 0 || t2 <= 0)
				{
					JOptionPane.showMessageDialog (null, "Congratulations. You won!", "You win!", JOptionPane.INFORMATION_MESSAGE);
					cdLayout.show (p_card, "1");
					screen3 ();
					screen4 ();
				}
			}
		}
	}
	
	
	boolean changeofheart = false;
	boolean swordsofrevealinglight = false;
	boolean darkhole = false;
	boolean potofgreed = false;
	boolean braincontrol = false;
	boolean curemaster = false;
	boolean lightningvortex = false;
	boolean doublesummon = false;
	boolean finaldestiny = false;
	boolean fissure = false;
	
	public void activatecard ()
	{
		// call the card function depending on what card is activated.
		if (cardtoactivate == 10)
		{
			changeofheart ();
		}
		
		
		else if (cardtoactivate == 11)
		{
			swordsofrevealinglight ();
		}
		
		
		else if (cardtoactivate == 12)
		{
			darkhole ();
		}
		
		
		else if (cardtoactivate == 13)
		{
			potofgreed ();
		}
		
		
		else if (cardtoactivate == 14)
		{
			braincontrol ();
		}
		
		
		else if (cardtoactivate == 15)
		{
			curemaster ();
		}
		
		
		else if (cardtoactivate == 16)
		{
			lightningvortex ();
		}
		
		
		else if (cardtoactivate == 17)
		{
			doublesummon ();
		}
		
		
		else if (cardtoactivate == 18)
		{
			finaldestiny ();
		}
		
		
		else if (cardtoactivate == 19)
		{
			fissure ();
		}
	}
	
	
	int cardch = 100;
	int monchanged = 11;
	int firstch = 0;
	int changeback;
	boolean spellerase;
	int spellpos;
	public void changeofheart ()
	{
		firstch++;
		changeofheart = true;
		if (firstch == 1)
			JOptionPane.showMessageDialog (null, "Please select a monster your opponent controls.", "Change of Heart", JOptionPane.INFORMATION_MESSAGE);
		
		if (cardch != 100)
		{
			if (player1turn == true)
			{
				m2 [sendgravep2].setIcon (null);
				nocardm2 [sendgravep2] = true;
				opponentm1 [sendgravep2].setIcon (null);
				if (nocardm [0] == true)
				{
					m [0].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [0] = false;
					changeback = 0;
				}
				else if (nocardm [1] == true)
				{
					m [1].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [1] = false;
					changeback = 1;
				}
				else if (nocardm [2] == true)
				{
					m [2].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [2] = false;
					changeback = 2;
				}
				else if (nocardm [3] == true)
				{
					m [3].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [3] = false;
					changeback = 3;
				}
				else if (nocardm [4] == true)
				{
					m [4].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [4] = false;
					changeback = 4;
				}
				if (over == true)
				{
					changeofheart = false;
					m2 [sendgravep2].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [sendgravep2] = false;
					opponentm1 [sendgravep2].setIcon (createImageIcon (cardch + ".jpg"));
					m [changeback].setIcon (null);
					nocardm [changeback] = true;
					if (spellerase == true)
					{
						s [spellpos].setIcon (null);
					}
				}
				over = false;
			}
			else
			{
				m [sendgravep1].setIcon (null);
				nocardm [sendgravep1] = true;
				opponentm2 [sendgravep1].setIcon (null);
				if (nocardm2 [0] == true)
				{
					m2 [0].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [0] = false;
					changeback = 0;
				}
				else if (nocardm [1] == true)
				{
					m2 [1].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [1] = false;
					changeback = 1;
				}
				else if (nocardm [2] == true)
				{
					m2 [2].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [2] = false;
					changeback = 2;
				}
				else if (nocardm [3] == true)
				{
					m2 [3].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [3] = false;
					changeback = 3;
				}
				else if (nocardm2 [4] == true)
				{
					m2 [4].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [4] = false;
					changeback = 4;
				}
				if (over == true)
				{
					changeofheart = false;
					m [sendgravep1].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [sendgravep1] = false;
					opponentm1 [sendgravep1].setIcon (createImageIcon (cardch + ".jpg"));
					m2 [changeback].setIcon (null);
					nocardm2 [changeback] = true;
					if (spellerase == true)
					{
						s2 [spellpos].setIcon (null);
					}
				}
				over = false;
			}
		}
		if (player1turn == true)
			h [sendgravep1].setEnabled (true);
		else if (player1turn == false)
			hand2 [sendgravep1].setEnabled (false);
	}
	
	
	int firstsrl = 0;
	int cardsrl = 100;
	int countersrl = 0;
	public void swordsofrevealinglight ()
	{
		firstsrl++;
		swordsofrevealinglight = true;
		if (firstsrl == 1)
			JOptionPane.showMessageDialog (null, "Please select a monster your opponent controls.", "Swords of Revealing Light", JOptionPane.INFORMATION_MESSAGE);
		
		
		if (cardsrl != 100)
		{
			if (player1turn == true)
			{
				m2 [sendgravep2].setEnabled (false);
				if (spellerase == true)
					s [spellpos].setIcon (null);
			}
			else
			{
				m [sendgravep2].setEnabled (false);
				if (spellerase == true)
					s2 [spellpos].setIcon (null);
			}
			if (player1turn == true)
				h [sendgravep1].setEnabled (true);
			else if (player1turn == false)
				hand2 [sendgravep1].setEnabled (false);
			
			
		}
	}
	
	
	public void darkhole ()
	{
		darkhole = true;
		
		for (int i = 0 ; i < 5 ; i++)
		{
			m [i].setIcon (null);
			grave.setIcon (null);
			s [i].setIcon (null);
			m2 [i].setIcon (null);
			grave2.setIcon (null);
			s2 [i].setIcon (null);
			opponentm1 [i].setIcon (null);
			opponentm2 [i].setIcon (null);
			opponents1 [i].setIcon (null);
			opponents2 [i].setIcon (null);
		}
		
		
		if (player1turn == true)
		{
			if (spellerase == true)
				s [spellpos].setIcon (null);
		}
		
		
		else
		{
			if (spellerase == true)
				s2 [spellpos].setIcon (null);
		}
		if (player1turn == true)
			h [sendgravep1].setEnabled (true);
		else if (player1turn == false)
			hand2 [sendgravep1].setEnabled (false);
	}
	
	
	int spotsfree = 0;
	int spotsfree2 = 0;
	int firstpog = 0;
	public void potofgreed ()
	{
		potofgreed = true;
		firstpog++;
		if (firstpog == 1)
			JOptionPane.showMessageDialog (null, "Please draw 2 cads", "Pot of Greed", JOptionPane.INFORMATION_MESSAGE);
		
		
		int original = spotsfree;
		int original2 = spotsfree;
		
		int max1 = original + 2;
		int max2 = original2 + 2;
		
		if (spotsfree < 4 && spotsfree < max1 || spotsfree2 < 4 && spotsfree2 < max2)
		{
			if (player1turn == true)
				deck.setEnabled (true);
			else
				deck2.setEnabled (true);
			if (player1turn == true)
				h [sendgravep1].setEnabled (true);
			else if (player1turn == false)
				hand2 [sendgravep1].setEnabled (false);
		}
		
		
		else
		{
			if (player1turn == true)
				deck.setEnabled (false);
			else
				deck2.setEnabled (false);
		}
		
		
		if (player1turn == true)
		{
			if (spellerase == true)
				s [spellpos].setIcon (null);
		}
		
		
		else
		{
			if (spellerase == true)
				s2 [spellpos].setIcon (null);
		}
	}
	
	
	int cardbc = 100;
	int firstbc = 0;
	public void braincontrol ()
	{
		firstbc++;
		braincontrol = true;
		if (firstbc == 1)
		{
			JOptionPane.showMessageDialog (null, "Please select a monster your opponent controls.", "Brain Control", JOptionPane.INFORMATION_MESSAGE);
			if (player1turn == true)
				lifepointp1 -= 800;
			else
				lifepointp2 -= 800;
		}
		
		
		if (cardbc != 100)
		{
			if (player1turn == true)
			{
				m2 [sendgravep2].setIcon (null);
				nocardm2 [sendgravep2] = true;
				opponentm1 [sendgravep2].setIcon (null);
				if (nocardm [0] == true)
				{
					m [0].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [0] = false;
					changeback = 0;
				}
				else if (nocardm [1] == true)
				{
					m [1].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [1] = false;
					changeback = 1;
				}
				else if (nocardm [2] == true)
				{
					m [2].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [2] = false;
					changeback = 2;
				}
				else if (nocardm [3] == true)
				{
					m [3].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [3] = false;
					changeback = 3;
				}
				else if (nocardm [4] == true)
				{
					m [4].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [4] = false;
					changeback = 4;
				}
				if (over == true)
				{
					braincontrol = false;
					m2 [sendgravep2].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [sendgravep2] = false;
					opponentm1 [sendgravep2].setIcon (createImageIcon (cardch + ".jpg"));
					m [changeback].setIcon (null);
					nocardm [changeback] = true;
					if (spellerase == true)
					{
						s [spellpos].setIcon (null);
					}
				}
				over = false;
			}
			else
			{
				m [sendgravep1].setIcon (null);
				nocardm [sendgravep1] = true;
				opponentm2 [sendgravep1].setIcon (null);
				if (nocardm2 [0] == true)
				{
					m2 [0].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [0] = false;
					changeback = 0;
				}
				else if (nocardm [1] == true)
				{
					m2 [1].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [1] = false;
					changeback = 1;
				}
				else if (nocardm [2] == true)
				{
					m2 [2].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [2] = false;
					changeback = 2;
				}
				else if (nocardm [3] == true)
				{
					m2 [3].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [3] = false;
					changeback = 3;
				}
				else if (nocardm2 [4] == true)
				{
					m2 [4].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm2 [4] = false;
					changeback = 4;
				}
				if (over == true)
				{
					braincontrol = false;
					m [sendgravep1].setIcon (createImageIcon (cardch + ".jpg"));
					nocardm [sendgravep1] = false;
					opponentm1 [sendgravep1].setIcon (createImageIcon (cardch + ".jpg"));
					m2 [changeback].setIcon (null);
					nocardm2 [changeback] = true;
					if (spellerase == true)
					{
						s2 [spellpos].setIcon (null);
					}
				}
				over = false;
			}
		}
		if (player1turn == true)
			h [sendgravep1].setEnabled (true);
		else if (player1turn == false)
			hand2 [sendgravep1].setEnabled (false);
	}
	
	
	public void curemaster ()
	{
		if (player1turn == true)
		{
			lifepointp1 += 1000;
			LP4.setText ("Life Points left: " + lifepointp1);
			LP.setText ("Life Points left: " + lifepointp1);
			if (spellerase == true)
			{
				s [spellpos].setIcon (null);
			}
			
		}
		
		
		else
		{
			lifepointp2 += 1000;
			LP3.setText ("Life Points left: " + lifepointp1);
			LP2.setText ("Life Points left: " + lifepointp1);
			if (spellerase == true)
			{
				s2 [spellpos].setIcon (null);
			}
		}
		if (player1turn == true)
			h [sendgravep1].setEnabled (true);
		else if (player1turn == false)
			hand2 [sendgravep1].setEnabled (false);
	}
	
	
	public void lightningvortex ()
	{
		if (player1turn == true)
		{
			for (int i = 0 ; i < 5 ; i++)
				m2 [i].setIcon (null);
			if (spellerase == true)
			{
				s [spellpos].setIcon (null);
			}
		}
		
		
		else
		{
			for (int i = 0 ; i < 5 ; i++)
				m [i].setIcon (null);
			if (spellerase == true)
			{
				s2 [spellpos].setIcon (null);
			}
		}
		if (player1turn == true)
			h [sendgravep1].setEnabled (true);
		else if (player1turn == false)
			hand2 [sendgravep1].setEnabled (false);
	}
	
	
	public void doublesummon ()
	{
		summon--;
		if (player1turn == true)
		{
			if (spellerase == true)
			{
				s [spellpos].setIcon (null);
			}
			
		}
		
		
		else
		{
			if (spellerase == true)
			{
				s2 [spellpos].setIcon (null);
			}
		}
		if (player1turn == true)
			h [sendgravep1].setEnabled (true);
		else if (player1turn == false)
			hand2 [sendgravep1].setEnabled (false);
	}
	
	
	public void finaldestiny ()
	{
		if (player1turn == true)
		{
			if (h1 == 1 && h2 == 1 && h3 == 1 && h4 == 1 && h5 == 1)
			{
				for (int i = 0 ; i < 5 ; i++)
				{
					m [i].setIcon (null);
					grave.setIcon (null);
					s [i].setIcon (null);
					m2 [i].setIcon (null);
					grave2.setIcon (null);
					s2 [i].setIcon (null);
					opponentm1 [i].setIcon (null);
					opponentm2 [i].setIcon (null);
					opponents1 [i].setIcon (null);
					opponents2 [i].setIcon (null);
					
				}
				if (spellerase == true)
				{
					s [spellpos].setIcon (null);
				}
			}
			else
				JOptionPane.showMessageDialog (null, "5 cards not in hand.", "Final Destiny", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		else
		{
			if (h1v2 == 1 && h2v2 == 1 && h3v2 == 1 && h4v2 == 1 && h5v2 == 1)
			{
				for (int i = 0 ; i < 5 ; i++)
				{
					m [i].setIcon (null);
					grave.setIcon (null);
					s [i].setIcon (null);
					m2 [i].setIcon (null);
					grave2.setIcon (null);
					s2 [i].setIcon (null);
					opponentm1 [i].setIcon (null);
					opponentm2 [i].setIcon (null);
					opponents1 [i].setIcon (null);
					opponents2 [i].setIcon (null);
				}
				if (spellerase == true)
				{
					s2 [spellpos].setIcon (null);
				}
			}
			else
				JOptionPane.showMessageDialog (null, "5 cards not in hand.", "Final Destiny", JOptionPane.INFORMATION_MESSAGE);
		}
		if (player1turn == true)
			h [sendgravep1].setEnabled (true);
		else if (player1turn == false)
			hand2 [sendgravep1].setEnabled (false);
	}
	
	
	int cardtodestroy;
	public void fissure ()
	{
		if (player1turn == true)
		{
			for (int i = 1 ; i < 5 ; i++)
			{
				if (attack2 [mon2 [i - 1]] <= attack2 [mon2 [i]])
					cardtodestroy = i;
			}
			m2 [cardtodestroy].setIcon (null);
			if (spellerase == true)
			{
				s [spellpos].setIcon (null);
			}
			if (player1turn == true)
				h [sendgravep1].setEnabled (true);
			else if (player1turn == false)
				hand2 [sendgravep1].setEnabled (false);
		}
		
		
		else
		{
			for (int i = 1 ; i < 5 ; i++)
			{
				if (attack [mon [i - 1]] <= attack [mon [i]])
					
				cardtodestroy = i;
			}
			m [cardtodestroy].setIcon (null);
			if (spellerase == true)
			{
				s2 [spellpos].setIcon (null);
			}
		}
	}
	
	
	public void screen1 ()
	{ //screen 1 is set up.
		
		card1 = new Panel ();
		card1.setBackground (Color.white);
		JLabel title = new JLabel (createImageIcon ("Title Screen.jpg"));
		JLabel space = new JLabel (" ");
		space.setPreferredSize (new Dimension (85, 1));
		JButton next = new JButton ("Instructions");
		next.setActionCommand ("card2");
		next.addActionListener (this);
		JOptionPane.showMessageDialog (null, "Please make the game full screen to enjoy the full experience.", "Full Screen", JOptionPane.INFORMATION_MESSAGE);
		card1.add (title);
		card1.add (space);
		card1.add (next);
		p_card.add ("1", card1);
	}
	
	
	public void screen2 ()
	{ //screen 2 is set up.
		
		card2 = new Panel ();
		card2.setBackground (Color.white);
		
		JLabel title = new JLabel ("Instructions");
		title.setFont (new Font ("Arial", Font.BOLD, 25));
		JLabel space3 = new JLabel (" ");
		space3.setPreferredSize (new Dimension (450, 1));
		title.setForeground (Color.red);
		JLabel space2 = new JLabel (" ");
		space2.setPreferredSize (new Dimension (450, 1));
		JLabel space4 = new JLabel (" ");
		space4.setPreferredSize (new Dimension (450, 1));
		step = new JLabel (createImageIcon ("i" + n + ".jpg"));
		JLabel space = new JLabel (" ");
		space.setPreferredSize (new Dimension (350, 1));
		JButton next = new JButton ("Next");
		next.setActionCommand ("next");
		next.addActionListener (this);
		next.setForeground (Color.black);
		next.setBackground (Color.yellow);
		JButton back = new JButton ("Back");
		back.setActionCommand ("back");
		back.addActionListener (this);
		back.setForeground (Color.black);
		back.setBackground (Color.yellow);
		JButton nextscreen = new JButton ("PLAY!");
		nextscreen.setActionCommand ("card3");
		nextscreen.addActionListener (this);
		card2.add (space3);
		card2.add (title);
		card2.add (space2);
		card2.add (space4);
		card2.add (step);
		card2.add (nextscreen);
		card2.add (space);
		card2.add (back);
		card2.add (next);
		p_card.add ("2", card2);
		
	}
	
	
	
	
	public void screen3 ()
	{ //screen 3 is set up.
		
		Panel desc = new Panel (new GridLayout (2, 1));
		
		largecard = new JLabel (" ");
		largecard.setBackground (Color.white);
		largecard.setPreferredSize (new Dimension (215, 300));
		cd = new JTextArea ("Click on a card to see its description here. ");
		desc.add (largecard);
		desc.add (cd);
		Panel g = new Panel (new GridLayout (3, 5));
		card3 = new Panel ();
		card3.setBackground (Color.white);
		Panel all = new Panel ();
		
		//JLabel space1 = new JLabel ("");
		//space1.setPreferredSize (new Dimension (300, 1));
		//card3.add (space1);
		
		for (int i = 0 ; i < 4 ; i++)
		{
			phase [i] = new JButton ("");
			phase [i].setPreferredSize (new Dimension (100, 50));
			phase [i].setBackground (Color.yellow);
			phase [i].setFont (new Font ("Arial", Font.PLAIN, 20));
			card3.add (phase [i]);
		}
		
		
		phase [0].setText ("Draw");
		phase [0].addActionListener (this);
		phase [0].setActionCommand ("draw");
		
		phase [1].setText ("Main");
		phase [1].addActionListener (this);
		phase [1].setActionCommand ("main");
		
		phase [2].setText ("Battle");
		phase [2].addActionListener (this);
		phase [2].setActionCommand ("battle");
		
		phase [3].setText ("End");
		phase [3].addActionListener (this);
		phase [3].setActionCommand ("end");
		
		//JLabel space2 = new JLabel ("");
		//space2.setPreferredSize (new Dimension (300, 1));
		//card3.add (space2);
		
		Panel opponent = new Panel (new GridLayout (2, 1));
		
		for (int i = 0 ; i < 5 ; i++)
		{
			opponents1 [i] = new JButton (" ");
			opponents1 [i].setPreferredSize (new Dimension (91, 133));
			opponents1 [i].setBackground (Color.cyan);
			opponents1 [i].addActionListener (this);
			opponents1 [i].setActionCommand ("opponents1" + i);
			opponent.add (opponents1 [i]);
		}
		
		
		for (int i = 0 ; i < 5 ; i++)
		{
			opponentm1 [i] = new JButton (" ");
			opponentm1 [i].setPreferredSize (new Dimension (91, 133));
			opponentm1 [i].setBackground (Color.orange);
			opponentm1 [i].addActionListener (this);
			opponentm1 [i].setActionCommand ("opponentm1" + i);
			opponent.add (opponentm1 [i]);
		}
		
		
		card3.add (opponent);
		JLabel ospace = new JLabel ("");
		ospace.setPreferredSize (new Dimension (25, 1));
		card3.add (ospace);
		
		for (int i = 0 ; i < 5 ; i++)
		{
			m [i] = new JButton (" ");
			m [i].setPreferredSize (new Dimension (91, 133));
			m [i].setBackground (Color.orange);
			m [i].addActionListener (this);
			m [i].setActionCommand ("m" + i);
			g.add (m [i]);
		}
		
		
		grave = new JButton (" ");
		grave.setPreferredSize (new Dimension (91, 133));
		grave.setBackground (Color.gray);
		grave.addActionListener (this);
		grave.setActionCommand ("g");
		g.add (grave);
		for (int i = 0 ; i < 5 ; i++)
		{
			s [i] = new JButton (" ");
			s [i].setPreferredSize (new Dimension (91, 133));
			s [i].setBackground (Color.cyan);
			s [i].addActionListener (this);
			s [i].setActionCommand ("s" + i);
			g.add (s [i]);
		}
		
		
		deck = new JButton (" ");
		deck.setPreferredSize (new Dimension (91, 133));
		deck.setIcon (createImageIcon ("Back.jpg"));
		deck.addActionListener (this);
		deck.setActionCommand ("d");
		g.add (deck);
		cardsleft = new JLabel ("Number of cards left: " + t);
		cardsleft.setFont (new Font ("Impact", Font.PLAIN, 25));
		for (int i = 0 ; i < 5 ; i++)
		{
			h [i] = new JButton (" ");
			h [i].setPreferredSize (new Dimension (91, 133));
			h [i].setBackground (Color.white);
			h [i].addActionListener (this);
			h [i].setActionCommand ("h" + i);
			g.add (h [i]);
		}
		
		
		all.add (opponent);
		all.add (desc);
		all.add (g);
		card3.add (all);
		LP2 = new JLabel ("Life Points left: " + lifepointp2);
		LP2.setFont (new Font ("Impact", Font.PLAIN, 25));
		LP2.setForeground (Color.blue);
		card3.add (LP2);
		JLabel OP = new JLabel ("<Opponent's Side< ");
		OP.setFont (new Font ("Arial", Font.BOLD, 30));
		OP.setForeground (Color.red);
		card3.add (OP);
		JLabel ospace3 = new JLabel ("");
		ospace3.setPreferredSize (new Dimension (50, 1));
		card3.add (ospace3);
		JLabel PP = new JLabel (">Player 1's Side> ");
		PP.setFont (new Font ("Arial", Font.BOLD, 30));
		PP.setForeground (Color.blue);
		card3.add (PP);
		card3.add (cardsleft);
		LP = new JLabel ("Life Points left: " + lifepointp1);
		LP.setFont (new Font ("Impact", Font.PLAIN, 25));
		LP.setForeground (Color.red);
		card3.add (LP);
		
		p_card.add ("3", card3);
	}
	
	
	public void screen4 ()
	{ //screen 4 is set up.
		card4 = new Panel ();
		Panel desc = new Panel (new GridLayout (2, 1));
		
		largecard2 = new JLabel (" ");
		largecard2.setBackground (Color.white);
		largecard2.setPreferredSize (new Dimension (215, 300));
		cd2 = new JTextArea ("Click on a card to see its description here. ");
		desc.add (largecard2);
		desc.add (cd2);
		Panel all = new Panel ();
		
		
		JLabel space1 = new JLabel ("");
		space1.setPreferredSize (new Dimension (300, 1));
		card4.add (space1);
		
		for (int i = 0 ; i < 4 ; i++)
		{
			phase2 [i] = new JButton ("");
			phase2 [i].setPreferredSize (new Dimension (100, 50));
			phase2 [i].setBackground (Color.yellow);
			phase2 [i].setFont (new Font ("Arial", Font.PLAIN, 20));
			card4.add (phase2 [i]);
		}
		
		
		phase2 [0].setText ("Draw");
		phase2 [0].addActionListener (this);
		phase2 [0].setActionCommand ("draw");
		
		phase2 [1].setText ("Main");
		phase2 [1].addActionListener (this);
		phase2 [1].setActionCommand ("main");
		
		phase2 [2].setText ("Battle");
		phase2 [2].addActionListener (this);
		phase2 [2].setActionCommand ("battle");
		
		phase2 [3].setText ("End");
		phase2 [3].addActionListener (this);
		phase2 [3].setActionCommand ("end");
		
		JLabel space2 = new JLabel ("");
		space2.setPreferredSize (new Dimension (300, 1));
		card4.add (space2);
		
		Panel g2 = new Panel (new GridLayout (3, 5));
		Panel opponent = new Panel (new GridLayout (2, 1));
		
		for (int i = 0 ; i < 5 ; i++)
		{
			opponents2 [i] = new JButton (" ");
			opponents2 [i].setPreferredSize (new Dimension (91, 133));
			opponents2 [i].setBackground (Color.cyan);
			opponents2 [i].addActionListener (this);
			opponents2 [i].setActionCommand ("opponents2" + i);
			opponent.add (opponents2 [i]);
		}
		
		
		for (int i = 0 ; i < 5 ; i++)
		{
			opponentm2 [i] = new JButton (" ");
			opponentm2 [i].setPreferredSize (new Dimension (91, 133));
			opponentm2 [i].setBackground (Color.orange);
			opponentm2 [i].addActionListener (this);
			opponentm2 [i].setActionCommand ("opponentm2" + i);
			opponent.add (opponentm2 [i]);
		}
		
		
		card4.add (opponent);
		JLabel ospace = new JLabel ("");
		ospace.setPreferredSize (new Dimension (25, 1));
		card4.add (ospace);
		
		for (int i = 0 ; i < 5 ; i++)
		{
			m2 [i] = new JButton (" ");
			m2 [i].setPreferredSize (new Dimension (91, 133));
			m2 [i].setBackground (Color.orange);
			m2 [i].addActionListener (this);
			m2 [i].setActionCommand ("m2" + i);
			g2.add (m2 [i]);
		}
		
		
		grave2 = new JButton (" ");
		grave2.setPreferredSize (new Dimension (91, 133));
		grave2.setBackground (Color.gray);
		grave2.addActionListener (this);
		grave2.setActionCommand ("g2");
		g2.add (grave2);
		for (int i = 0 ; i < 5 ; i++)
		{
			s2 [i] = new JButton (" ");
			s2 [i].setPreferredSize (new Dimension (91, 133));
			s2 [i].setBackground (Color.cyan);
			s2 [i].addActionListener (this);
			s2 [i].setActionCommand ("s2" + i);
			g2.add (s2 [i]);
		}
		
		
		deck2 = new JButton (" ");
		deck2.setPreferredSize (new Dimension (91, 133));
		deck2.setIcon (createImageIcon ("Back.jpg"));
		deck2.addActionListener (this);
		deck2.setActionCommand ("d2");
		g2.add (deck2);
		cardsleft2 = new JLabel ("Number of cards left: " + t2);
		cardsleft2.setFont (new Font ("Impact", Font.PLAIN, 25));
		
		
		for (int i = 0 ; i < 5 ; i++)
		{
			hand2 [i] = new JButton (" ");
			hand2 [i].setPreferredSize (new Dimension (91, 133));
			hand2 [i].setBackground (Color.white);
			hand2 [i].addActionListener (this);
			hand2 [i].setActionCommand ("h2" + i);
			g2.add (hand2 [i]);
		}
		
		
		all.add (opponent);
		all.add (desc);
		all.add (g2);
		card4.add (all);
		LP4 = new JLabel ("Life Points left: " + lifepointp1);
		LP4.setFont (new Font ("Impact", Font.PLAIN, 25));
		LP4.setForeground (Color.blue);
		card4.add (LP4);
		JLabel OP = new JLabel ("<Opponent's Side< ");
		OP.setFont (new Font ("Arial", Font.BOLD, 30));
		OP.setForeground (Color.red);
		card4.add (OP);
		JLabel ospace3 = new JLabel ("");
		ospace3.setPreferredSize (new Dimension (50, 1));
		card4.add (ospace3);
		JLabel PP = new JLabel (">Player 2's Side> ");
		PP.setFont (new Font ("Arial", Font.BOLD, 30));
		PP.setForeground (Color.blue);
		card4.add (PP);
		card4.add (cardsleft2);
		LP3 = new JLabel ("Life Points left: " + lifepointp2);
		LP3.setFont (new Font ("Impact", Font.PLAIN, 25));
		LP3.setForeground (Color.red);
		card4.add (LP3);
		
		p_card.add ("4", card4);
	}
	
	
	public void screen5 ()
	{ //screen 5 is set up.
		card5 = new Panel ();
		card5.setBackground (Color.cyan);
		JLabel title = new JLabel ("Icon tell you another");
		JLabel title2 = new JLabel ("knock knock joke.");
		JLabel title3 = new JLabel ("Do you want me to?");
		JButton next = new JButton ("Yes");
		next.setActionCommand ("card1");
		next.addActionListener (this);
		card5.add (title);
		card5.add (title2);
		card5.add (title3);
		card5.add (next);
		p_card.add ("5", card5);
	}
	
	
	public void actionPerformed (ActionEvent e)
	{ //instructions movement
		
		//for the instructions page
		if (e.getActionCommand ().equals ("next") && n < 18 && n > 0)
		{
			n++;
			step.setIcon (createImageIcon ("i" + n + ".jpg"));
			
		}
		
		
		else if (e.getActionCommand ().equals ("next") && n == 18)
		{
			n = 1;
			step.setIcon (createImageIcon ("i" + n + ".jpg"));
			
		}
		
		
		else if (e.getActionCommand ().equals ("back") && n == 1)
		{
			n = 18;
			step.setIcon (createImageIcon ("i" + n + ".jpg"));
			
		}
		
		
		else if (e.getActionCommand ().equals ("back"))
		{
			n--;
			step.setIcon (createImageIcon ("i" + n + ".jpg"));
			
		}
		
		
		//moves between the screens
		else if (e.getActionCommand ().equals ("card1"))
			cdLayout.show (p_card, "1");
		else if (e.getActionCommand ().equals ("card2"))
			cdLayout.show (p_card, "2");
		else if (e.getActionCommand ().equals ("card3"))
		{
			cdLayout.show (p_card, "3");
			phase [0].setEnabled (true);
			phase [1].setEnabled (false);
			phase [2].setEnabled (false);
			phase [3].setEnabled (false);
			if (firstturn == 0)
			{
				phase [0].setEnabled (false);
				JOptionPane.showMessageDialog (null, "Player 1: Please draw your first 4 cards. \n(Deck Button)", "Draw 4 Cards", JOptionPane.INFORMATION_MESSAGE);
				for (int i = 0 ; i < deck1.length ; i++)
				{
					d [i] = 0;
					shuffle ();
				}
				for (int i = 0 ; i < 5 ; i++)
				{
					m [i].setEnabled (false);
					grave.setEnabled (false);
					s [i].setEnabled (false);
					m2 [i].setEnabled (false);
					grave2.setEnabled (false);
					s2 [i].setEnabled (false);
					if (t > 0)
						deck.setEnabled (true);
					else if (t2 > 0)
						deck2.setEnabled (true);
					firstturn = 1;
				}
			}
			if (firstturn == 3)
				firstturn2 = 3;
		}
		
		
		else if (e.getActionCommand ().equals ("end"))
		{
			end ();
			firstturn = 3;
			if (firstturn2 == 0 && endturn.equals ("Yes"))
			{
				phase2 [0].setEnabled (false);
				JOptionPane.showMessageDialog (null, "Player 2: Please draw your first 4 cards. \n(Deck Button)", "Draw 4 Cards", JOptionPane.INFORMATION_MESSAGE);
				for (int i = 0 ; i < deck1.length ; i++)
				{
					d2 [i] = 0;
					shuffle ();
				}
				for (int i = 0 ; i < 5 ; i++)
				{
					m [i].setEnabled (false);
					grave.setEnabled (false);
					s [i].setEnabled (false);
					m2 [i].setEnabled (false);
					grave2.setEnabled (false);
					s2 [i].setEnabled (false);
					deck.setEnabled (true);
					deck2.setEnabled (true);
					
				}
				firstturn2 = 1;
			}
		}
		
		
		else if (e.getActionCommand ().equals ("draw"))
		{
			if (player1turn == true)
				deck.setEnabled (true);
			else
				deck2.setEnabled (true);
			draw ();
		}
		
		
		else if (e.getActionCommand ().equals ("main"))
			main ();
		else if (e.getActionCommand ().equals ("battle"))
			battle ();
		else // the games code
		{
			
			// shows what to display on the opponents side of teh field.
			if (e.getActionCommand ().equals ("opponentm10"))
			{
				if (nocardm2 [0] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (mon2 [0] + "d.jpg"));
						cd.setText (description [mon2 [0]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
				if (battle == true && nocardm2 [0] == false || nocardm2 [1] == false || nocardm2 [2] == false || nocardm2 [3] == false || nocardm2 [4] == false)
				{
					oatkactive = true;
					sendgravep2 = 0;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon2 [0];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon2 [0];
					changeofheart ();
					opponentm2 [0].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon2 [0];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon2 [0];
					braincontrol ();
					opponentm2 [0].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm20"))
			{
				if (nocardm [0] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (mon [0] + "d.jpg"));
						cd2.setText (description [mon [0]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
				if (battle == true && nocardm [0] == false || nocardm [1] == false || nocardm [2] == false || nocardm [3] == false || nocardm [4] == false)
				{
					oatkactive = true;
					sendgravep1 = 0;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon [0];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon [0];
					changeofheart ();
					opponentm1 [0].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon2 [0];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon [0];
					braincontrol ();
					opponentm1 [0].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm11"))
			{
				if (nocardm2 [1] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (mon2 [1] + "d.jpg"));
						cd.setText (description [mon2 [1]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
				if (battle == true && nocardm2 [0] == false || nocardm2 [1] == false || nocardm2 [2] == false || nocardm2 [3] == false || nocardm2 [4] == false)
				{
					oatkactive = true;
					sendgravep2 = 1;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon2 [1];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon2 [1];
					changeofheart ();
					opponentm2 [1].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon2 [1];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon2 [1];
					braincontrol ();
					opponentm2 [1].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm21"))
			{
				if (nocardm [1] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (mon [1] + "d.jpg"));
						cd2.setText (description [mon [1]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
				if (battle == true && nocardm [0] == false || nocardm [1] == false || nocardm [2] == false || nocardm [3] == false || nocardm [4] == false)
				{
					oatkactive = true;
					sendgravep1 = 1;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon [1];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon [1];
					changeofheart ();
					opponentm1 [1].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon [1];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon [1];
					braincontrol ();
					opponentm1 [1].setIcon (null);
				}
				
			}
			else if (e.getActionCommand ().equals ("opponentm12"))
			{
				if (nocardm2 [2] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (mon2 [2] + "d.jpg"));
						cd.setText (description [mon2 [2]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
				if (battle == true && nocardm2 [0] == false || nocardm2 [1] == false || nocardm2 [2] == false || nocardm2 [3] == false || nocardm2 [4] == false)
				{
					oatkactive = true;
					sendgravep2 = 2;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon2 [2];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon2 [2];
					changeofheart ();
					
					opponentm2 [2].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon2 [2];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon2 [2];
					braincontrol ();
					opponentm2 [2].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm22"))
			{
				if (nocardm [2] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (mon [2] + "d.jpg"));
						cd2.setText (description [mon [2]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
				if (battle == true && nocardm [0] == false || nocardm [1] == false || nocardm [2] == false || nocardm [3] == false || nocardm [4] == false)
					oatkactive = true;
				sendgravep1 = 2;
				
				if (oatkactive == true)
				{
					monvalue2 = mon [2];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon [2];
					changeofheart ();
					
					opponentm1 [2].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon [2];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon [2];
					braincontrol ();
					opponentm1 [2].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm13"))
			{
				if (nocardm2 [3] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (mon2 [3] + "d.jpg"));
						cd.setText (description [mon2 [3]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
				if (battle == true && nocardm2 [0] == false || nocardm2 [1] == false || nocardm2 [2] == false || nocardm2 [3] == false || nocardm2 [4] == false)
				{
					oatkactive = true;
					sendgravep2 = 3;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon2 [3];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon2 [3];
					changeofheart ();
					
					opponentm2 [3].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon [3];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon2 [3];
					braincontrol ();
					opponentm2 [3].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm23"))
			{
				if (nocardm [3] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (mon [3] + "d.jpg"));
						cd2.setText (description [mon [3]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
				if (battle == true && nocardm [0] == false || nocardm [1] == false || nocardm [2] == false || nocardm [3] == false || nocardm [4] == false)
				{
					oatkactive = true;
					sendgravep1 = 3;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon [3];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon [3];
					changeofheart ();
					
					opponentm1 [3].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon [3];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon [3];
					braincontrol ();
					opponentm1 [3].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm14"))
			{
				if (nocardm2 [4] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (mon2 [4] + "d.jpg"));
						cd.setText (description [mon2 [4]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
				if (battle == true && nocardm2 [0] == false || nocardm2 [1] == false || nocardm2 [2] == false || nocardm2 [3] == false || nocardm2 [4] == false)
				{
					oatkactive = true;
					sendgravep2 = 4;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon2 [4];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon2 [4];
					changeofheart ();
					
					opponentm2 [4].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon2 [4];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon2 [4];
					braincontrol ();
					opponentm2 [4].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponentm24"))
			{
				if (nocardm [4] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (mon [4] + "d.jpg"));
						cd2.setText (description [mon [4]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
				if (battle == true && nocardm [0] == false || nocardm [1] == false || nocardm [2] == false || nocardm [3] == false || nocardm [4] == false)
				{
					oatkactive = true;
					sendgravep1 = 4;
				}
				if (oatkactive == true)
				{
					monvalue2 = mon [4];
					battle ();
				}
				if (changeofheart == true)
				{
					cardch = mon [4];
					changeofheart ();
					
					opponentm1 [4].setIcon (null);
				}
				else if (swordsofrevealinglight == true)
				{
					cardsrl = mon [4];
					swordsofrevealinglight ();
				}
				else if (braincontrol == true)
				{
					cardbc = mon [4];
					braincontrol ();
					opponentm1 [4].setIcon (null);
				}
			}
			else if (e.getActionCommand ().equals ("opponents10"))
			{
				if (nocardf2 [0] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (spe2 [0] + "d.jpg"));
						cd.setText (description [spe2 [0]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents20"))
			{
				if (nocardf [0] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (spe [0] + "d.jpg"));
						cd2.setText (description [spe [0]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents11"))
			{
				if (nocardf2 [1] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (spe2 [1] + "d.jpg"));
						cd.setText (description [spe2 [1]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents21"))
			{
				if (nocardf [1] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (spe [1] + "d.jpg"));
						cd2.setText (description [spe [1]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents12"))
			{
				if (nocardf2 [2] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (spe2 [2] + "d.jpg"));
						cd.setText (description [spe2 [2]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents22"))
			{
				if (nocardf [2] == false)
				{
					largecard2.setIcon (createImageIcon (spe [2] + "d.jpg"));
					cd2.setText (description [spe [2]]);
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents13"))
			{
				if (nocardf2 [3] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (spe2 [3] + "d.jpg"));
						cd.setText (description [spe2 [3]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents23"))
			{
				if (nocardf [3] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (spe [3] + "d.jpg"));
						cd2.setText (description [spe [3]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents14"))
			{
				if (nocardf2 [4] == false)
				{
					if (notviewable == false)
					{
						largecard.setIcon (createImageIcon (spe2 [4] + "d.jpg"));
						cd.setText (description [spe2 [4]]);
					}
				}
				else
				{
					largecard.setIcon (null);
					cd.setText ("No card selected.");
				}
			}
			else if (e.getActionCommand ().equals ("opponents24"))
			{
				if (nocardf [4] == false)
				{
					if (notviewable == false)
					{
						largecard2.setIcon (createImageIcon (spe [4] + "d.jpg"));
						cd2.setText (description [spe [4]]);
					}
				}
				else
				{
					largecard2.setIcon (null);
					cd2.setText ("No card selected.");
				}
			}
			// sets variables and calls function hand whenever the button is pressed.
			String xfh = "100";
			if (e.getActionCommand ().equals ("hand0"))
			{
				xh = "0";
				xfh = "0";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand02"))
			{
				xh = "02";
				xfh = "02";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand0v2"))
			{
				xh = "0v2";
				xfh = "0v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand02v2"))
			{
				xh = "02v2";
				xfh = "02v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand1"))
			{
				xh = "1";
				xfh = "1";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand12"))
			{
				xh = "12";
				xfh = "12";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand1v2"))
			{
				xh = "1v2";
				xfh = "1v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand12v2"))
			{
				xh = "12v2";
				xfh = "12v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand2"))
			{
				xh = "2";
				xfh = "2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand22"))
			{
				xh = "22";
				xfh = "22";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand2v2"))
			{
				xh = "2v2";
				xfh = "2v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand22v2"))
			{
				xh = "22v2";
				xfh = "22v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand3"))
			{
				xh = "3";
				xfh = "3";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand32"))
			{
				xh = "32";
				xfh = "32";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand3v2"))
			{
				xh = "3v2";
				xfh = "3v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand32v2"))
			{
				xh = "32v2";
				xfh = "32v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand4"))
			{
				xh = "4";
				xfh = "4";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand42"))
			{
				xh = "42";
				xfh = "42";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand4v2"))
			{
				xh = "4v2";
				xfh = "4v2";
				hand (xfh);
			}
			else if (e.getActionCommand ().equals ("hand42v2"))
			{
				xh = "42v2";
				xfh = "42v2";
				hand (xfh);
			}
			
			
			
			// sets variables and calls function monster whenever button is pressed.
			String xm = "100";
			
			if (e.getActionCommand ().equals ("m0"))
			{
				xm = "0";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon [0];
					atktrue [0] = true;
					atktrue [1] = false;
					atktrue [2] = false;
					atktrue [3] = false;
					atktrue [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
				}
			}
			else if (e.getActionCommand ().equals ("m02"))
			{
				xm = "02";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon2 [0];
					atktrue2 [0] = true;
					atktrue2 [1] = false;
					atktrue2 [2] = false;
					atktrue2 [3] = false;
					atktrue2 [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
				}
			}
			else if (e.getActionCommand ().equals ("m1"))
			{
				xm = "1";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon [1];
					atktrue [0] = false;
					atktrue [1] = true;
					atktrue [2] = false;
					atktrue [3] = false;
					atktrue [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
				}
			}
			else if (e.getActionCommand ().equals ("m12"))
			{
				xm = "12";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon2 [1];
					atktrue2 [0] = false;
					atktrue2 [1] = true;
					atktrue2 [2] = false;
					atktrue2 [3] = false;
					atktrue2 [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
				}
				
			}
			else if (e.getActionCommand ().equals ("m2"))
			{
				xm = "2";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon [2];
					atktrue [0] = false;
					atktrue [1] = false;
					atktrue [2] = true;
					atktrue [3] = false;
					atktrue [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
					
					
				}
			}
			else if (e.getActionCommand ().equals ("m22"))
			{
				xm = "22";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon2 [2];
					atktrue2 [0] = false;
					atktrue2 [1] = false;
					atktrue2 [2] = true;
					atktrue2 [3] = false;
					atktrue2 [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
					
				}
			}
			else if (e.getActionCommand ().equals ("m3"))
			{
				xm = "3";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon [3];
					atktrue [0] = false;
					atktrue [1] = false;
					atktrue [2] = false;
					atktrue [3] = true;
					atktrue [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
					
				}
			}
			else if (e.getActionCommand ().equals ("m32"))
			{
				xm = "32";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon2 [3];
					atktrue2 [0] = false;
					atktrue2 [1] = false;
					atktrue2 [2] = false;
					atktrue2 [3] = true;
					atktrue2 [4] = false;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
					
				}
				
			}
			else if (e.getActionCommand ().equals ("m4"))
			{
				xm = "4";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon [4];
					atktrue [0] = false;
					atktrue [1] = false;
					atktrue [2] = false;
					atktrue [3] = false;
					atktrue [4] = true;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
					
				}
			}
			else if (e.getActionCommand ().equals ("m42"))
			{
				xm = "42";
				monster (xm, xh);
				if (battle == true)
				{
					monvalue1 = mon2 [4];
					atktrue2 [0] = false;
					atktrue2 [1] = false;
					atktrue2 [2] = false;
					atktrue2 [3] = false;
					atktrue2 [4] = true;
					if (player1turn == true)
					{
						if (nocardm2 [0] == true && nocardm2 [1] == true && nocardm2 [2] == true && nocardm2 [3] == true && nocardm2 [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					else
					{
						if (nocardm [0] == true && nocardm [1] == true && nocardm [2] == true && nocardm [3] == true && nocardm [4] == true && firstturn == 3 && firstturn2 == 3)
						{
							active = true;
						}
					}
					atkactive = true;
					battle ();
					
					
				}
			}
			
			else if (e.getActionCommand ().equals ("m0v2"))
			{
				xm = "0v2";
				monster (xm, xh);
				nmonsters++;
			}
			
			
			else if (e.getActionCommand ().equals ("m02v2"))
			{
				xm = "02v2";
				monster (xm, xh);
				nmonsters2++;
				
			}
			
			
			else if (e.getActionCommand ().equals ("m1v2"))
			{
				xm = "1v2";
				monster (xm, xh);
				nmonsters++;
				
			}
			
			
			else if (e.getActionCommand ().equals ("m12v2"))
			{
				xm = "12v2";
				monster (xm, xh);
				nmonsters2++;
				
				
			}
			
			
			else if (e.getActionCommand ().equals ("m2v2"))
			{
				xm = "2v2";
				monster (xm, xh);
				nmonsters++;
				
			}
			
			
			else if (e.getActionCommand ().equals ("m22v2"))
			{
				xm = "22v2";
				monster (xm, xh);
				nmonsters2++;
				
			}
			
			
			else if (e.getActionCommand ().equals ("m3v2"))
			{
				xm = "3v2";
				monster (xm, xh);
				nmonsters++;
				
				
			}
			
			
			else if (e.getActionCommand ().equals ("m32v2"))
			{
				xm = "32v2";
				monster (xm, xh);
				nmonsters2++;
				
			}
			
			
			else if (e.getActionCommand ().equals ("m4v2"))
			{
				xm = "4v2";
				monster (xm, xh);
				nmonsters++;
				
			}
			
			
			else if (e.getActionCommand ().equals ("m42v2"))
			{
				xm = "42v2";
				monster (xm, xh);
				nmonsters2++;
				
			}
			
			
			// putting spell card in spell zone
			String xst = "100";
			if (e.getActionCommand ().equals ("s0"))
			{
				xst = "0";
				spelltrap (activate, xst, xh);
			}
			else if (e.getActionCommand ().equals ("s02"))
			{
				xst = "02";
				spelltrap (activate, xst, xh);
			}
			else if (e.getActionCommand ().equals ("s1"))
			{
				xst = "1";
				spelltrap (activate, xst, xh);
			}
			else if (e.getActionCommand ().equals ("s12"))
			{
				xst = "12";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s2"))
			{
				xst = "2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s22"))
			{
				xst = "22";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s3"))
			{
				xst = "3";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s32"))
			{
				xst = "32";
				spelltrap (activate, xst, xst);
			}
			
			
			else if (e.getActionCommand ().equals ("s4"))
			{
				xst = "4";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s42"))
			{
				xst = "42";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s0v2"))
			{
				xst = "0v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s02v2"))
			{
				xst = "02v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s1v2"))
			{
				xst = "1v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s12v2"))
			{
				xst = "12v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s2v2"))
			{
				xst = "2v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s22v2"))
			{
				xst = "22v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s3v2"))
			{
				xst = "3v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s32v2"))
			{
				xst = "32v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s4v2"))
			{
				xst = "4v2";
				spelltrap (activate, xst, xh);
			}
			
			
			else if (e.getActionCommand ().equals ("s42v2"))
			{
				xst = "42v2";
				spelltrap (activate, xst, xh);
			}
			
			
			
			// when player clicks on the deck to pick up card
			if (e.getActionCommand ().equals ("d"))
			{
				if (potofgreed == true)
					potofgreed ();
				x = t;
				if (h1 == 0)
				{
					spotsfree++;
					d [0] = deck1 [i];
					h1 = 1;
					h [0].setIcon (createImageIcon (deck1 [i] + ".jpg"));
					h [0].setActionCommand ("hand0");
					t--;
					cardsleft.setText ("Number of cards left " + t);
					nocard = false;
				}
				else if (h2 == 0)
				{
					spotsfree++;
					d [1] = deck1 [i];
					h2 = 1;
					h [1].setIcon (createImageIcon (deck1 [i] + ".jpg"));
					h [1].setActionCommand ("hand1");
					t--;
					cardsleft.setText ("Number of cards left " + t);
					nocard = false;
				}
				else if (h3 == 0)
				{
					spotsfree++;
					d [2] = deck1 [i];
					h3 = 1;
					h [2].setIcon (createImageIcon (deck1 [i] + ".jpg"));
					h [2].setActionCommand ("hand2");
					t--;
					cardsleft.setText ("Number of cards left " + t);
					nocard = false;
				}
				else if (h4 == 0)
				{
					spotsfree++;
					if (firstturn == 1)
					{
						phase [0].setEnabled (true);
						deck.setEnabled (false);
						firstturn = 2;
					}
					d [3] = deck1 [i];
					h4 = 1;
					h [3].setIcon (createImageIcon (deck1 [i] + ".jpg"));
					h [3].setActionCommand ("hand3");
					t--;
					cardsleft.setText ("Number of cards left " + t);
					nocard = false;
				}
				else if (h5 == 0)
				{
					spotsfree++;
					d [4] = deck1 [i];
					h5 = 1;
					h [4].setIcon (createImageIcon (deck1 [i] + ".jpg"));
					h [4].setActionCommand ("hand4");
					t--;
					cardsleft.setText ("Number of cards left " + t);
					nocard = false;
				}
				
				if (t == 0)
					deck.setEnabled (false);
				
				
				// if (i < (deck1.length - 1))
				i++;
				if (draw == true)
				{
					if (t == (x - 1))
					{
						deck.setEnabled (false);
					}
				}
				
			}
			
			
			else if (e.getActionCommand ().equals ("d2"))
			{
				if (potofgreed == true)
					potofgreed ();
				x2 = t2;
				if (h1v2 == 0)
				{
					spotsfree2++;
					d2 [0] = deckp2 [i2];
					h1v2 = 1;
					hand2 [0].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
					hand2 [0].setActionCommand ("hand02");
					t2--;
					cardsleft2.setText ("Number of cards left " + t2);
					nocard2 = false;
				}
				else if (h2v2 == 0)
				{
					spotsfree2++;
					d2 [1] = deckp2 [i2];
					h2v2 = 1;
					hand2 [1].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
					hand2 [1].setActionCommand ("hand12");
					t2--;
					cardsleft2.setText ("Number of cards left " + t2);
					nocard2 = false;
				}
				else if (h3v2 == 0)
				{
					spotsfree2++;
					d2 [2] = deckp2 [i2];
					h3v2 = 1;
					hand2 [2].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
					hand2 [2].setActionCommand ("hand22");
					t2--;
					cardsleft2.setText ("Number of cards left " + t2);
					nocard2 = false;
				}
				else if (h4v2 == 0)
				{
					spotsfree2++;
					if (firstturn2 == 1)
					{
						phase2 [0].setEnabled (true);
						deck2.setEnabled (false);
						firstturn2 = 2;
					}
					d2 [3] = deckp2 [i2];
					h4v2 = 1;
					hand2 [3].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
					hand2 [3].setActionCommand ("hand32");
					t2--;
					cardsleft2.setText ("Number of cards left " + t2);
					nocard2 = false;
				}
				else if (h5v2 == 0)
				{
					spotsfree2++;
					d2 [4] = deckp2 [i2];
					h5v2 = 1;
					hand2 [4].setIcon (createImageIcon (deckp2 [i2] + ".jpg"));
					hand2 [4].setActionCommand ("hand42");
					t2--;
					cardsleft2.setText ("Number of cards left " + t2);
					nocard2 = false;
				}
				
				
				if (t2 == 0)
					deck2.setEnabled (false);
				
				// if (i < (deck1.length - 1))
				i2++;
				if (draw == true)
				{
					if (t2 == (x2 - 1))
					{
						deck2.setEnabled (false);
					}
				}
			}
		}
	}
	
	// function hand helps the player choose where he would like to place his card.
	public void hand (String x)
	{
		int y = 100;
		if (x.equals ("0") || x.equals ("02"))
			y = 0;
		else if (x.equals ("1") || x.equals ("12"))
			y = 1;
		else if (x.equals ("2") || x.equals ("22"))
			y = 2;
		else if (x.equals ("3") || x.equals ("32"))
			y = 3;
		else if (x.equals ("4") || x.equals ("42"))
			y = 4;
		else if (x.equals ("0v2") || x.equals ("02v2"))
			y = 0;
		else if (x.equals ("1v2") || x.equals ("12v2"))
			y = 1;
		else if (x.equals ("2v2") || x.equals ("22v2"))
			y = 2;
		else if (x.equals ("3v2") || x.equals ("32v2"))
			y = 3;
		else if (x.equals ("4v2") || x.equals ("42v2"))
			y = 4;
		if (x.equals ("" + y) || x.equals (y + "2"))
		{
			
			if (x.equals ("" + y))
			{
				largecard.setIcon (createImageIcon (d [y] + "d.jpg"));
				cd.setText (description [d [y]]);
				h [y].setActionCommand ("hand" + y + "v2");
				nocard = false;
			}
			else
			{
				largecard2.setIcon (createImageIcon (d2 [y] + "d.jpg"));
				cd2.setText (description [d2 [y]]);
				hand2 [y].setActionCommand ("hand" + y + "2v2");
				nocard2 = false;
			}
			
		}
		
		
		else if (x.equals (y + "v2") || x.equals (y + "2v2"))
		{
			
			if (x.equals (y + "v2"))
			{
				cardtochange = d [y];
				if (cardtochange < 10)
				{
					if (summon == 1)
						JOptionPane.showMessageDialog (null, "You have already summoned once. You cannot summon again.", "Cannot Summon", JOptionPane.INFORMATION_MESSAGE);
					else
					{
						if (level [cardtochange] > 4 && level [cardtochange] < 7)
						{
							tribute = (String) JOptionPane.showInputDialog (null, "Would you like to Tribute Summon (1 monster required)? ", "Tribute Summon?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
							if (tribute.equals ("Yes"))
							{
								ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
								JOptionPane.showMessageDialog (null, "Click which card you would like to tribute.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else if (level [cardtochange] > 6)
						{
							tribute = (String) JOptionPane.showInputDialog (null, "Would you like to Tribute Summon (2 monsters required)? ", "Tribute Summon?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
							if (tribute.equals ("Yes"))
							{
								ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
								JOptionPane.showMessageDialog (null, "Click which cards you would like to tribute.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
							}
							
							
						}
						else
							ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
					}
				}
				else if (cardtochange > 9)
				{
					activate = (String) JOptionPane.showInputDialog (null, "Would you like to activate?", "Activate?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
				}
				if (summon != 1 || tribute.equals ("Yes") || ws.equals ("Yes") || activate.equals ("Yes"))
				{
					
					JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
					if (activate.equals ("Yes"))
					{
						cardtoactivate = cardtochange;
						activatecard ();
					}
					spottoerase = y;
					sendgravep1 = y;
					h [y].setActionCommand ("hand" + y);
					m [0].setActionCommand ("m0v2");
					m [1].setActionCommand ("m1v2");
					m [2].setActionCommand ("m2v2");
					m [3].setActionCommand ("m3v2");
					m [4].setActionCommand ("m4v2");
					s [0].setActionCommand ("s0v2");
					s [1].setActionCommand ("s1v2");
					s [2].setActionCommand ("s2v2");
					s [3].setActionCommand ("s3v2");
					s [4].setActionCommand ("s4v2");
					nocard = true;
				}
			}
			else
			{
				cardtochange = d2 [y];
				if (cardtochange < 10)
				{
					if (summon == 1)
						JOptionPane.showMessageDialog (null, "You have already summoned once. You cannot summon again.", "Cannot Summon", JOptionPane.INFORMATION_MESSAGE);
					else
					{
						if (level2 [cardtochange] > 4 && level2 [cardtochange] < 7)
						{
							tribute = (String) JOptionPane.showInputDialog (null, "Would you like to Tribute Summon (1 monster required)? ", "Tribute Summon?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
							if (tribute.equals ("Yes"))
							{
								ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
								JOptionPane.showMessageDialog (null, "Click which card you would like to tribute.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
								for (int i = 0 ; i < 5 ; i++)
									nocardm2 [i] = true;
							}
						}
						else if (level2 [cardtochange] > 6)
						{
							tribute = (String) JOptionPane.showInputDialog (null, "Would you like to Tribute Summon (2 monsters required)? ", "Tribute Summon?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
							if (tribute.equals ("Yes"))
							{
								ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
								JOptionPane.showMessageDialog (null, "Click which cards you would like to tribute.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
								for (int i = 0 ; i < 5 ; i++)
									nocardm2 [i] = true;
							}
							
							
						}
						else
							ws = (String) JOptionPane.showInputDialog (null, "Would you like to summon or set?", "Summon or Set?", JOptionPane.INFORMATION_MESSAGE, null, sors, sors [0]);
					}
				}
				else if (cardtochange > 9)
				{
					activate = (String) JOptionPane.showInputDialog (null, "Would you like to activate?", "Activate?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
				}
				if (summon != 1 || tribute.equals ("Yes") || ws.equals ("Yes") || activate.equals ("Yes"))
				{
					JOptionPane.showMessageDialog (null, "Click where you would like to place the card.", "Where to Place?", JOptionPane.INFORMATION_MESSAGE);
					if (activate.equals ("Yes"))
						activatecard ();
					spottoerase = y;
					sendgravep2 = y;
					hand2 [y].setActionCommand ("hand" + y + "2");
					m2 [0].setActionCommand ("m0v2");
					m2 [0].setActionCommand ("m02v2");
					m2 [1].setActionCommand ("m12v2");
					m2 [2].setActionCommand ("m22v2");
					m2 [3].setActionCommand ("m32v2");
					m2 [4].setActionCommand ("m42v2");
					s2 [0].setActionCommand ("s02v2");
					s2 [1].setActionCommand ("s12v2");
					s2 [2].setActionCommand ("s22v2");
					s2 [3].setActionCommand ("s32v2");
					s2 [4].setActionCommand ("s42v2");
					nocard = true;
				}
			}
		}
	}
	
	
	// depending on what button the player presses, the corresponding button will display the new card.
	public void monster (String x, String z)
	{
		int y = 100;
		int i = 100;
		if (x.equals ("0") || x.equals ("02"))
			y = 0;
		else if (x.equals ("1") || x.equals ("12"))
			y = 1;
		else if (x.equals ("2") || x.equals ("22"))
			y = 2;
		else if (x.equals ("3") || x.equals ("32"))
			y = 3;
		else if (x.equals ("4") || x.equals ("42"))
			y = 4;
		else if (x.equals ("0v2") || x.equals ("02v2"))
			y = 0;
		else if (x.equals ("1v2") || x.equals ("12v2"))
			y = 1;
		else if (x.equals ("2v2") || x.equals ("22v2"))
			y = 2;
		else if (x.equals ("3v2") || x.equals ("32v2"))
			y = 3;
		else if (x.equals ("4v2") || x.equals ("42v2"))
			y = 4;
		if (z.equals ("0") || z.equals ("02"))
			i = 0;
		else if (z.equals ("1") || z.equals ("12"))
			i = 1;
		else if (z.equals ("2") || z.equals ("22"))
			i = 2;
		else if (z.equals ("3") || z.equals ("32"))
			i = 3;
		else if (z.equals ("4") || z.equals ("42"))
			i = 4;
		else if (z.equals ("0v2") || z.equals ("02v2"))
			i = 0;
		else if (z.equals ("1v2") || z.equals ("12v2"))
			i = 1;
		else if (z.equals ("2v2") || z.equals ("22v2"))
			i = 2;
		else if (z.equals ("3v2") || z.equals ("32v2"))
			i = 3;
		else if (z.equals ("4v2") || z.equals ("42v2"))
			i = 4;
		
		if (x.equals ("" + y) || x.equals (y + "2") || x.equals ("null"))
		{
			if (player1turn == true)
			{
				sendgravep1 = y;
				if (nocardm [y] == true)
				{
					largecard.setIcon (null);
					cd.setText ("Click on a card to see its description here. ");
				}
				else
				{
					largecard.setIcon (createImageIcon (mon [y] + "d.jpg"));
					cd.setText (description [mon [y]]);
				}
			}
			else
			{
				sendgravep2 = y;
				if (nocardm2 [y] == true)
				{
					
					largecard2.setIcon (null);
					cd2.setText ("Click on a card to see its description here. ");
					
				}
				else
				{
					largecard2.setIcon (createImageIcon (mon2 [y] + "d.jpg"));
					cd2.setText (description [mon2 [y]]);
				}
			}
		}
		
		
		// putting monster card in monster zone
		else if (x.equals (y + "v2") || x.equals (y + "2v2"))
		{
			if (x.equals (y + "v2"))
			{
				if (cardtochange >= 10)
					JOptionPane.showMessageDialog (null, "The card you have selected is a spell card. It can only be played in the spell card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
				else
				{
					if (nocardm [y] == true)
					{
						if (tribute.equals ("Yes"))
						{
							JOptionPane.showMessageDialog (null, "No monster located here.", "No Monster", JOptionPane.INFORMATION_MESSAGE);
							tribute = "No";
						}
						else
						{
							spotsfree--;
							summon = 1;
							mon [y] = cardtochange;
							if (i == 0)
								h1 = 0;
							else if (i == 1)
								h2 = 0;
							else if (i == 2)
								h3 = 0;
							else if (i == 3)
								h4 = 0;
							else if (i == 4)
								h5 = 0;
							if (ws.equals ("Summon"))
							{
								m [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								opponentm2 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								atkordef [y] = 1;
							}
							else
							{
								m [y].setIcon (createImageIcon ("Back.jpg"));
								opponentm2 [y].setIcon (createImageIcon ("Back.jpg"));
								atkordef [y] = 0;
							}
							h [spottoerase].setIcon (null);
							nocardm [y] = false;
							m [0].setActionCommand ("m0");
							m [1].setActionCommand ("m1");
							m [2].setActionCommand ("m2");
							m [3].setActionCommand ("m3");
							m [4].setActionCommand ("m4");
							s [0].setActionCommand ("s0");
							s [1].setActionCommand ("s1");
							s [2].setActionCommand ("s2");
							s [3].setActionCommand ("s3");
							s [4].setActionCommand ("s4");
							h [spottoerase].setActionCommand (null);
							tribute = "No";
						}
						
					}
					else if (nocardm [y] == false && tribute.equals ("Yes"))
					{
						if (level [cardtochange] > 4 && level [cardtochange] < 7)
						{
							spotsfree--;
							summon = 1;
							mon [y] = cardtochange;
							if (i == 0)
								h1 = 0;
							else if (i == 1)
								h2 = 0;
							else if (i == 2)
								h3 = 0;
							else if (i == 3)
								h4 = 0;
							else if (i == 4)
								h5 = 0;
							if (ws.equals ("Summon"))
							{
								m [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								opponentm2 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								atkordef [y] = 1;
							}
							else
							{
								m [y].setIcon (createImageIcon ("Back.jpg"));
								opponentm2 [y].setIcon (createImageIcon ("Back.jpg"));
								atkordef [y] = 0;
							}
							h [spottoerase].setIcon (null);
							nocardm [y] = false;
							m [0].setActionCommand ("m0");
							m [1].setActionCommand ("m1");
							m [2].setActionCommand ("m2");
							m [3].setActionCommand ("m3");
							m [4].setActionCommand ("m4");
							s [0].setActionCommand ("s0");
							s [1].setActionCommand ("s1");
							s [2].setActionCommand ("s2");
							s [3].setActionCommand ("s3");
							s [4].setActionCommand ("s4");
							h [spottoerase].setActionCommand (null);
							tribute = "No";
						}
						
						else
						{
							spotsfree--;
							summon = 1;
							tbcounter++;
							mon [y] = cardtochange;
							if (i == 0)
								h1 = 0;
							else if (i == 1)
								h2 = 0;
							else if (i == 2)
								h3 = 0;
							else if (i == 3)
								h4 = 0;
							else if (i == 4)
								h5 = 0;
							if (ws.equals ("Summon"))
							{
								m [y].setIcon (null);
							}
							else
							{
								m [y].setIcon (null);
							}
							if (tbcounter == 2)
							{
								mon [y] = cardtochange;
								if (i == 0)
									h1 = 0;
								else if (i == 1)
									h2 = 0;
								else if (i == 2)
									h3 = 0;
								else if (i == 3)
									h4 = 0;
								else if (i == 4)
									h5 = 0;
								if (ws.equals ("Summon"))
								{
									m [y].setIcon (createImageIcon (cardtochange + ".jpg"));
									opponentm2 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
									atkordef [y] = 1;
								}
								else
								{
									m [y].setIcon (createImageIcon ("Back.jpg"));
									opponentm2 [y].setIcon (createImageIcon ("Back.jpg"));
									atkordef [y] = 0;
								}
								h [spottoerase].setIcon (null);
								nocardm [y] = false;
								m [0].setActionCommand ("m0");
								m [1].setActionCommand ("m1");
								m [2].setActionCommand ("m2");
								m [3].setActionCommand ("m3");
								m [4].setActionCommand ("m4");
								s [0].setActionCommand ("s0");
								s [1].setActionCommand ("s1");
								s [2].setActionCommand ("s2");
								s [3].setActionCommand ("s3");
								s [4].setActionCommand ("s4");
								h [spottoerase].setActionCommand (null);
								tribute = "No";
							}
							
						}
					}
					else
					{
						JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
			else
			{
				if (cardtochange >= 10)
					JOptionPane.showMessageDialog (null, "The card you have selected is a spell card. It can only be played in the spell card zone (cyan tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
				else
				{
					if (nocardm2 [y] == true)
					{
						if (tribute.equals ("Yes"))
						{
							JOptionPane.showMessageDialog (null, "No monster located here.", "No Monster", JOptionPane.INFORMATION_MESSAGE);
							tribute = "No";
						}
						else
						{
							spotsfree2--;
							summon = 1;
							mon2 [y] = cardtochange;
							if (i == 0)
								h1v2 = 0;
							else if (i == 1)
								h2v2 = 0;
							else if (i == 2)
								h3v2 = 0;
							else if (i == 3)
								h4v2 = 0;
							else if (i == 4)
								h5v2 = 0;
							if (ws.equals ("Summon"))
							{
								m2 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								opponentm1 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								atkordef2 [y] = 1;
							}
							else
							{
								m2 [y].setIcon (createImageIcon ("Back.jpg"));
								opponentm1 [y].setIcon (createImageIcon ("Back.jpg"));
								atkordef2 [y] = 0;
							}
							hand2 [spottoerase].setIcon (null);
							nocardm2 [y] = false;
							m2 [0].setActionCommand ("m02");
							m2 [1].setActionCommand ("m12");
							m2 [2].setActionCommand ("m22");
							m2 [3].setActionCommand ("m32");
							m2 [4].setActionCommand ("m42");
							s2 [0].setActionCommand ("s02");
							s2 [1].setActionCommand ("s12");
							s2 [2].setActionCommand ("s22");
							s2 [3].setActionCommand ("s32");
							s2 [4].setActionCommand ("s42");
							hand2 [spottoerase].setActionCommand (null);
							tribute = "No";
						}
					}
					else if (nocardm2 [y] == false && tribute.equals ("Yes"))
					{
						if (level2 [cardtochange] > 4 && level2 [cardtochange] < 7)
						{
							spotsfree2--;
							summon = 1;
							mon2 [y] = cardtochange;
							if (i == 0)
								h1v2 = 0;
							else if (i == 1)
								h2v2 = 0;
							else if (i == 2)
								h3v2 = 0;
							else if (i == 3)
								h4v2 = 0;
							else if (i == 4)
								h5v2 = 0;
							if (ws.equals ("Summon"))
							{
								m2 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								opponentm1 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
								atkordef2 [y] = 1;
							}
							else
							{
								notviewable = true;
								m2 [y].setIcon (createImageIcon ("Back.jpg"));
								opponentm1 [y].setIcon (createImageIcon ("Back.jpg"));
								atkordef2 [y] = 0;
							}
							hand2 [spottoerase].setIcon (null);
							nocardm2 [y] = false;
							m2 [0].setActionCommand ("m0");
							m2 [1].setActionCommand ("m1");
							m2 [2].setActionCommand ("m2");
							m2 [3].setActionCommand ("m3");
							m2 [4].setActionCommand ("m4");
							s2 [0].setActionCommand ("s0");
							s2 [1].setActionCommand ("s1");
							s2 [2].setActionCommand ("s2");
							s2 [3].setActionCommand ("s3");
							s2 [4].setActionCommand ("s4");
							hand2 [spottoerase].setActionCommand (null);
							tribute = "No";
						}
						else
						{
							spotsfree2--;
							summon = 1;
							tbcounter2++;
							mon2 [y] = cardtochange;
							if (i == 0)
								h1v2 = 0;
							else if (i == 1)
								h2v2 = 0;
							else if (i == 2)
								h3v2 = 0;
							else if (i == 3)
								h4v2 = 0;
							else if (i == 4)
								h5v2 = 0;
							if (ws.equals ("Summon"))
							{
								m2 [y].setIcon (null);
							}
							else
							{
								m2 [y].setIcon (null);
							}
							if (tbcounter2 == 2)
							{
								mon2 [y] = cardtochange;
								if (i == 0)
									h1v2 = 0;
								else if (i == 1)
									h2v2 = 0;
								else if (i == 2)
									h3v2 = 0;
								else if (i == 3)
									h4v2 = 0;
								else if (i == 4)
									h5v2 = 0;
								if (ws.equals ("Summon"))
								{
									m2 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
									opponentm1 [y].setIcon (createImageIcon (cardtochange + ".jpg"));
									atkordef2 [y] = 1;
								}
								else
								{
									notviewable = true;
									m2 [y].setIcon (createImageIcon ("Back.jpg"));
									opponentm1 [y].setIcon (createImageIcon ("Back.jpg"));
									atkordef2 [y] = 0;
								}
								hand2 [spottoerase].setIcon (null);
								nocardm2 [y] = false;
								m2 [0].setActionCommand ("m0");
								m2 [1].setActionCommand ("m1");
								m2 [2].setActionCommand ("m2");
								m2 [3].setActionCommand ("m3");
								m2 [4].setActionCommand ("m4");
								s2 [0].setActionCommand ("s0");
								s2 [1].setActionCommand ("s1");
								s2 [2].setActionCommand ("s2");
								s2 [3].setActionCommand ("s3");
								s2 [4].setActionCommand ("s4");
								hand2 [spottoerase].setActionCommand (null);
							}
							tribute = "No";
						}
					}
					else
					{
						JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		}
	}
	
	// depending on what the player presses it will display the card on the corresponding button.
	public void spelltrap (String activate, String x, String z)
	{
		// putting spell card in spell zone
		int y = 100;
		int i = 100;
		if (x.equals ("0") || x.equals ("02"))
			y = 0;
		else if (x.equals ("1") || x.equals ("12"))
			y = 1;
		else if (x.equals ("2") || x.equals ("s22"))
			y = 2;
		else if (x.equals ("3") || x.equals ("32"))
			y = 3;
		else if (x.equals ("4") || x.equals ("42"))
			y = 4;
		else if (x.equals ("0v2") || x.equals ("02v2"))
			y = 0;
		else if (x.equals ("1v2") || x.equals ("12v2"))
			y = 1;
		else if (x.equals ("2v2") || x.equals ("22v2"))
			y = 2;
		else if (x.equals ("3v2") || x.equals ("32v2"))
			y = 3;
		else if (x.equals ("4v2") || x.equals ("42v2"))
			y = 4;
		if (z.equals ("0") || z.equals ("02"))
			i = 0;
		else if (z.equals ("1") || z.equals ("12"))
			i = 1;
		else if (z.equals ("2") || z.equals ("22"))
			i = 2;
		else if (z.equals ("3") || z.equals ("32"))
			i = 3;
		else if (z.equals ("4") || z.equals ("42"))
			i = 4;
		else if (z.equals ("0v2") || z.equals ("02v2"))
			i = 0;
		else if (z.equals ("1v2") || z.equals ("12v2"))
			i = 1;
		else if (z.equals ("2v2") || z.equals ("22v2"))
			i = 2;
		else if (z.equals ("3v2") || z.equals ("32v2"))
			i = 3;
		else if (z.equals ("4v2") || z.equals ("42v2"))
			i = 4;
		
		if (x.equals ("" + y) || x.equals (y + "2"))
		{
			if (player1turn == true)
			{
				if (nocardf [y] == true)
				{
					largecard.setForeground (null);
					cd.setText ("Click on a card to see its description here. ");
				}
				else
				{
					largecard.setIcon (createImageIcon (spe [y] + "d.jpg"));
					cd.setText (description [spe [y]]);
					if (main == true)
					{
						cardtoactivate = spe [y];
						spellerase = true;
						spellpos = y;
						activate = (String) JOptionPane.showInputDialog (null, "Would you like to activate?", "Activate?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
						activatecard ();
					}
				}
				
			}
			else
			{
				if (nocardf2 [y] == true)
				{
					largecard2.setForeground (null);
					cd2.setText ("Click on a card to see its description here. ");
				}
				else
				{
					largecard2.setIcon (createImageIcon (spe2 [y] + "d.jpg"));
					cd2.setText (description [spe2 [y]]);
					if (main == true)
					{
						cardtoactivate = spe2 [y];
						spellerase = true;
						spellpos = y;
						activate = (String) JOptionPane.showInputDialog (null, "Would you like to activate?", "Activate?", JOptionPane.INFORMATION_MESSAGE, null, yesorno, yesorno [0]);
						activatecard ();
					}
				}
				
			}
		}
		
		
		else if (x.equals (y + "v2") || x.equals (y + "2v2"))
		{
			if (x.equals (y + "v2"))
			{
				if (cardtochange < 10)
					JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
				else
				{
					if (nocardf [y] == true)
					{
						spotsfree--;
						spe [y] = cardtochange;
						if (i == 0)
							h1 = 0;
						else if (i == 1)
							h2 = 0;
						else if (i == 2)
							h3 = 0;
						else if (i == 3)
							h4 = 0;
						else if (i == 4)
							h5 = 0;
						if (activate.equals ("Yes"))
						{
							h [spottoerase].setIcon (null);
							s [0].setActionCommand ("s0");
							s [1].setActionCommand ("s1");
							s [2].setActionCommand ("s2");
							s [3].setActionCommand ("s3");
							s [4].setActionCommand ("s4");
							m [0].setActionCommand ("m0");
							m [1].setActionCommand ("m1");
							m [2].setActionCommand ("m2");
							m [3].setActionCommand ("m3");
							m [4].setActionCommand ("m4");
							h [spottoerase].setActionCommand (null);
						}
						else
						{
							notviewable = true;
							s [y].setIcon (createImageIcon ("Back.jpg"));
							opponents2 [y].setIcon (createImageIcon ("Back.jpg"));
							h [spottoerase].setIcon (null);
							nocardf [y] = false;
							s [0].setActionCommand ("s0");
							s [1].setActionCommand ("s1");
							s [2].setActionCommand ("s2");
							s [3].setActionCommand ("s3");
							s [4].setActionCommand ("s4");
							m [0].setActionCommand ("m0");
							m [1].setActionCommand ("m1");
							m [2].setActionCommand ("m2");
							m [3].setActionCommand ("m3");
							m [4].setActionCommand ("m4");
							h [spottoerase].setActionCommand (null);
						}
					}
					else
					{
						JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				activate.equals ("No");
			}
			else
			{
				
				if (cardtochange < 10)
					JOptionPane.showMessageDialog (null, "The card you have selected is a monster card. It can only be played in the monster card zone (orange tiles). Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
				else
				{
					if (nocardf2 [y] == true)
					{
						spotsfree2--;
						spe2 [y] = cardtochange;
						if (y == 0)
							h1v2 = 0;
						else if (y == 1)
							h2v2 = 0;
						else if (y == 2)
							h3v2 = 0;
						else if (y == 3)
							h4v2 = 0;
						else if (y == 4)
							h5v2 = 0;
						if (activate.equals ("Yes"))
						{
							hand2 [spottoerase].setIcon (null);
							s2 [0].setActionCommand ("s02");
							s2 [1].setActionCommand ("s12");
							s2 [2].setActionCommand ("s22");
							s2 [3].setActionCommand ("s32");
							s2 [4].setActionCommand ("s42");
							m2 [0].setActionCommand ("m02");
							m2 [1].setActionCommand ("m12");
							m2 [2].setActionCommand ("m22");
							m2 [3].setActionCommand ("m32");
							m2 [4].setActionCommand ("m42");
							hand2 [spottoerase].setActionCommand (null);
						}
						else
						{
							notviewable = true;
							s2 [y].setIcon (createImageIcon ("Back.jpg"));
							opponents1 [y].setIcon (createImageIcon ("Back.jpg"));
							hand2 [spottoerase].setIcon (null);
							nocardf2 [0] = false;
							s2 [0].setActionCommand ("s02");
							s2 [1].setActionCommand ("s12");
							s2 [2].setActionCommand ("s22");
							s2 [3].setActionCommand ("s32");
							s2 [4].setActionCommand ("s42");
							m2 [0].setActionCommand ("m02");
							m2 [1].setActionCommand ("m12");
							m2 [2].setActionCommand ("m22");
							m2 [3].setActionCommand ("m32");
							m2 [4].setActionCommand ("m42");
							hand2 [spottoerase].setActionCommand (null);
						}
					}
					else
					{
						JOptionPane.showMessageDialog (null, "There is already a card in that location. Please try again.", "Card cannot be placed at desired location", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				activate.equals ("No");
			}
		}
	}
	
	// used to shuffle the deck.
	public void shuffle ()
	{
		//randomize deck
		if (firstturn == 0)
		{
			for (int i = 0 ; i < deck1.length ; i++)
			{
				int x = (int) (Math.random () * 20);
				int y = (int) (Math.random () * 20);
				int temp = deck1 [x];
				deck1 [x] = deck1 [y];
				deck1 [y] = temp;
			}
		}
		
		
		else if (firstturn2 == 0)
		{
			for (int i = 0 ; i < deck1.length ; i++)
			{
				int x = (int) (Math.random () * 20);
				int y = (int) (Math.random () * 20);
				int temp = deckp2 [x];
				deckp2 [x] = deckp2 [y];
				deckp2 [y] = temp;
			}
		}
	}
	
	
	protected static ImageIcon createImageIcon (String path)
	{
		java.net.URL imgURL = YUGIOH.class.getResource (path);
		if (imgURL != null)
		{
			return new ImageIcon (imgURL);
		}
		
		
		else
		{
			System.err.println ("Couldn't find file: " + path);
			return null;
		}
	}
}




