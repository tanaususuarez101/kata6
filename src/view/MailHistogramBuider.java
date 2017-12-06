package view;
import java.util.List;
import model.Mail;
import model.Histogram;

public class MailHistogramBuider {
    public static Histogram<String> build(List<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            histo.increment(new Mail(mail1).getDomain());
        }
        return histo;
    }
}