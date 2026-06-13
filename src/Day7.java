 /*public class Day7{
    static class Request{
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason){
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving request");
        }
        void reject() {
            System.out.println("Reject request");
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }
        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }
    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }
        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }

    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("gopzz","12.06.2026","cold");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("gopzz" ,"11.07.2026","Culturals");
        onDutyRequest.rejectOnDutyRequest();
    }
}*/
public class Day7 {
    static class payment {
        String amount;

        void transfer() {
            System.out.println("pay here");
        }
    }

    static class upipayment extends payment {
        @Override
        void transfer() {
            System.out.println("upipayment");
        }
    }

    static class cardpayment extends payment {
        @Override
        void transfer() {
            System.out.println("cardpayment");
        }
    }
    static class netbanking extends payment {
        @Override
        void transfer() {
            System.out.println("netbanking");
        }
    }
    static void main(){
        upipayment upipayment=new upipayment();
        upipayment.transfer();

        cardpayment cardpayment =new cardpayment();
        cardpayment.transfer();

        netbanking netbanking =new netbanking();
        netbanking.transfer();
    }
}

