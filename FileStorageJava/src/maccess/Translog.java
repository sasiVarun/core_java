package maccess;

import java.util.Date;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Translog implements Serializable {
		public long bAccNo;
		public float amt;
		public Date d;
		
		public Translog(long bAccNo, float amt, Date d) {
			this.bAccNo = bAccNo;
			this.amt = amt;
			this.d = d;
		}
		
		public String toString() {
			return "BAccNo: "+bAccNo + "\nAmt: "+amt+ "\nDate-Time: "+d; 
		}
}
