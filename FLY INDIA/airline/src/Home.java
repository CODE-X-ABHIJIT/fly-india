import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {
    public Home(){

        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1600,800);
        add(image);

        JLabel heading=new JLabel("FLY INDIA WELCOMES YOU");
        heading.setBounds(550,60,500,40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma",Font.PLAIN,36));
        image.add(heading);

        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        JMenu details=new JMenu("Details");
        menuBar.add(details);

        JMenuItem flightDetails=new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);


        JMenuItem customerDetails=new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);


//        JMenuItem reservationDetails=new JMenuItem("Reservation Details");
//        details.add(reservationDetails);


        JMenuItem bookFlight=new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);


        JMenuItem journeyDetails=new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);

        JMenuItem ticketCancellation=new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);

        JMenu ticket=new JMenu("Ticket");
        menuBar.add(ticket);

        JMenuItem boardingPass=new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);

        setVisible(true);
        setLocation(600,250);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Home");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {

        String text=ae.getActionCommand();
        if (text.equals("Add Customer Details")){
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new  BookFlight();
        }else if (text.equals("Journey Details")) {
            new  JourneyDetails();
        }else if (text.equals("Cancel Ticket")) {
            new  Cancel();
        }else if(text.equals("Boarding Pass")) {
            new BoardingPass();
        }
    }
    public static void main(String[] args) {
        new Home();
    }

}
