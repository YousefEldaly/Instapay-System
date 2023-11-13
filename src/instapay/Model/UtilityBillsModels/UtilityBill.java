package instapay.Model.UtilityBillsModels;

import java.util.Random;

public abstract class UtilityBill {
    private int billId;
    private int userId;
    private boolean isPaid;
    private float billAmount;

    public UtilityBill(int userId) {
        this.userId = userId;
        this.isPaid = false;
        this.billAmount = new Random().nextFloat(1, 1000);
    }

    public UtilityBill(int billId, int userId, boolean isPaid, float billAmount) {
        this(userId);
        this.billId = billId;
        this.isPaid = isPaid;
        this.billAmount = billAmount;
    }

    public abstract String details();

    public int getBillId() {
        return billId;
    }
    public int getUserId() {
        return userId;
    }
    public float getBillAmount() {
        return billAmount;
    }
    public boolean IsPaid() {
        return isPaid;
    }

    @Override
    public String toString() {
        return "UtilityBill{" +
                "billId=" + billId +
                ", userId=" + userId +
                ", isPaid=" + isPaid +
                ", billAmount=" + billAmount +
                '}';
    }

    public void payBill() {
        isPaid = true;

        // UpdateBillDB();
    }
}
