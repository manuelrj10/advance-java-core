package pgm;
abstract class SubmissionAlert {
    abstract void sendNotification();
}

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubmissionAlert alert = new SubmissionAlert() {
            @Override
            void sendNotification() {
                
                System.out.println("Notification: Exam submitted successfully!");
            }
        };

       
        alert.sendNotification();
    }
}
