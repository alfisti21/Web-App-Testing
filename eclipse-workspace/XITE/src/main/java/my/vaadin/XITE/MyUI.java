package my.vaadin.XITE;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@Theme("mytheme")
public class MyUI extends UI {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        Button button2 = new Button("Wanna see some primes???");                      

        final TextField name = new TextField();        
        //name.setConverter(Integer.class);
        name.setCaption("Type a natural number here to check if it's a prime number");

        Button button1 = new Button("Lets Check");
        button1.addClickListener( e -> {        	
        
          String b = name.getValue();
          try {
        	  
        	  int a = Integer.parseInt(b);        	 
          
          Primes pr = new Primes();
          if(a<0) {
        	  Notification notif = new Notification("Negative numbers don't have primes. Or do they???\r\n" + "\r\n" + "Answer 1: No.\r\n" + 
        	  		"By the usual definition of prime for integers, negative integers can not be prime.\r\n" + 
        	  		"By this definition, primes are integers greater than one with no positive divisors besides one and itself.\r\n"+
        	  		"Negative numbers are excluded. In fact, they are given no thought.\r\n" + 
        	  		"\r\n" + 
        	  		"Answer 2: Yes.\r\n" + 
        	  		"Now suppose we want to bring in the negative numbers: then -a divides b when every a does, so we treat them as essentially the same divisor.\r\n"+
        	  		"This happens because -1 divides 1, which in turn divides everything. Numbers that divide one are called units.\r\n" + 
        	  		"Two numbers a and b for which a is a unit times b are called associates.  So the divisors a and -a of b above are associates.\r\n" +         	  		
        	  		"In the same way, -3 and 3 are associates, and in a sense represent the same prime.\r\n" +         	  		
        	  		"So yes, negative integers can be prime (when viewed this way).  In fact the integer -p is prime whenever p, but since they are associates,\r\n"+
        	  		"we really do not have any new primes. Let's illustrate this with another example.\r\n" +         	  		
        	  		"The Gaussian integers are the complex numbers a+bi where a and b are both integers.  (Here i is the square root of -1).\r\n"+
        	  		"There are four units (integers that divide one) in this number system: 1, -1, i, and -i. So each prime has four associates.\r\n" +         	  		
        	  		"It is possible to create a system in which each primes has infinitely many associates.\r\n" + 
        	  		"\r\n" + 
        	  		"Answer 3: It doesn't matter\r\n" + 
        	  		"In more general number fields the confusion above disappears.  That is because most of these fields are not principal ideal domains\r\n" +
        	  		"and primes then are represented by ideals, not individual elements.  Looked at this way (-3), the set of all multiples of -3, is the same ideal as (3), the set of multiples of 3.\r\n" +         	  		
        	  		"-3 and 3 then generate exactly the same prime ideal.\r\n" +
        	  		"\r\n" +
            		"(Click this notification to close it)",
                      Notification.Type.WARNING_MESSAGE);
        	  notif.setDelayMsec(10000);
        	  notif.show(Page.getCurrent());
          } else if(pr.isPrime(a)) {
        	  Notification notif = new Notification(name.getValue() + 
                      "<b> is a Prime number :)</b>",
                      Notification.Type.HUMANIZED_MESSAGE);
        	  notif.setDelayMsec(4000);        	  
        	  notif.setHtmlContentAllowed(true);
        	  notif.show(Page.getCurrent());
          } else {        	  
        	  Notification notif = new Notification(name.getValue() + 
                      "<b> is not a Prime number :(</b>",
                      Notification.Type.HUMANIZED_MESSAGE);
        	  notif.setDelayMsec(4000);
        	  notif.setHtmlContentAllowed(true);
        	  notif.show(Page.getCurrent());
          }
          }catch(NumberFormatException ex) {
          	  Notification notif = new Notification("<b>Oops, something went wrong. Please enter a natural number.</b>", Notification.Type.ERROR_MESSAGE);
        	  notif.setDelayMsec(7000);
        	  notif.setHtmlContentAllowed(true);
        	  notif.show(Page.getCurrent());
          }
        });
        
        
        button2.addClickListener( e-> {
        	Notification nt = new Notification("The first 25 prime numbers (all the prime numbers less than 100) are:\r\n" +         		
        		"2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 and 97.\r\n" + 
        		"\r\n" +
        		"(Click this notification to close it)", Notification.Type.HUMANIZED_MESSAGE);
        	nt.setDelayMsec(4000);
        	nt.show(Page.getCurrent());
        });
        
        layout.addComponents(name, button1, button2);        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
    }
}
