package groupchat;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtFriend;
	private JTextField txtGroup;
	private JTextField txtJoinGroup;
	private JTextField txtMsg;
	private Facade facadePattern;
	private JTextArea txtChat;

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[54.00,grow][61.00,grow][291.00,grow]", "[][][][][][grow][]"));
		
		JLabel lblUserName = new JLabel("User Name");
		contentPane.add(lblUserName, "cell 1 0,alignx trailing");
		
		txtUserName = new JTextField();

		contentPane.add(txtUserName, "flowx,cell 2 0,growx");
		txtUserName.setColumns(10);
		
		JLabel lblFriend = new JLabel("Friend");
		contentPane.add(lblFriend, "cell 1 1,alignx trailing");
		
		txtFriend = new JTextField();

		contentPane.add(txtFriend, "flowx,cell 2 1,growx");
		txtFriend.setColumns(10);
		
		JButton btnAddFriend = new JButton("Add");

		contentPane.add(btnAddFriend, "cell 2 1");
		
		JButton btnDeleteFriend = new JButton("Delete");

		contentPane.add(btnDeleteFriend, "cell 2 1");
		
		JLabel lblGroup = new JLabel("Group");
		contentPane.add(lblGroup, "cell 1 2,alignx trailing");
		
		txtGroup = new JTextField();

		contentPane.add(txtGroup, "flowx,cell 2 2,growx");
		txtGroup.setColumns(10);
		
		JButton btnAddGroup = new JButton("Add");

		contentPane.add(btnAddGroup, "cell 2 2");
		
		JButton btnEditGroup = new JButton("Edit");

		contentPane.add(btnEditGroup, "cell 2 2");
		
		JLabel lblFriendList = new JLabel("Friend List");
		contentPane.add(lblFriendList, "cell 0 4");
		
		JLabel lblGroupList = new JLabel("Group List");
		contentPane.add(lblGroupList, "flowx,cell 1 4");
		
		txtJoinGroup = new JTextField();

		contentPane.add(txtJoinGroup, "flowx,cell 2 4");
		txtJoinGroup.setColumns(10);
		
		JButton btnJoinGroup = new JButton("Join");

		contentPane.add(btnJoinGroup, "cell 2 4");
		
		JButton btnLeaveGroup = new JButton("Leave");

		contentPane.add(btnLeaveGroup, "cell 2 4");
		
		JList list = new JList();
		contentPane.add(list, "cell 0 5,grow");
		
		JList list_1 = new JList();
		contentPane.add(list_1, "cell 1 5,grow");
		
		txtChat = new JTextArea();
		contentPane.add(txtChat, "cell 2 5,grow");
		
		JButton btnRegister = new JButton("Register");

		contentPane.add(btnRegister, "cell 2 0");
		
		JLabel lblMessage = new JLabel("Message");
		contentPane.add(lblMessage, "cell 1 6");
		
		txtMsg = new JTextField();

		contentPane.add(txtMsg, "flowx,cell 2 6,growx");
		txtMsg.setColumns(10);
		
		JButton btnSend = new JButton("Send");

		contentPane.add(btnSend, "cell 2 6");
		//start logic
		
		
		
		
		//end logic
		txtUserName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtUserName.getText();
			}
		});
		
		txtFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnAddFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnDeleteFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		txtGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnAddGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnEditGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		txtJoinGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnJoinGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnLeaveGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		txtMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	
	}

	public JTextArea getTxtChat() {
		return txtChat;
	}

	public void setTxtChat(JTextArea txtChat) {
		this.txtChat = txtChat;
	}
}
