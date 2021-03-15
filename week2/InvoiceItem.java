public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id= id;
        this.desc= desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice( double unitPrice) {
        return unitPrice;
    }
    public  double getTotal(){
        return unitPrice*qty;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public String toString(){
        return "InvoiceItem[id="+ id+",desc="+desc+",unitPrice="+unitPrice;
    }


}
