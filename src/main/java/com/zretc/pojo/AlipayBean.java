package com.zretc.pojo;

/*支付实体对象*/
public class AlipayBean {
    /*商户订单号，必填*/
    private String out_trade_no;
//    商品数量
    private int dsum;
//    商品价格
    private int dprice;
//    商品id
    private int proid;
    //订单时间
    private String dtime;
//    用户名称
    private String duser;
    /*订单名称，必填*/
    private String subject;
    /*付款金额，必填*/
    private StringBuffer total_amount;
    /*商品描述，可空*/
    private String body;
    /*超时时间参数*/
    private String timeout_express="10m";
    private String product_code="FAST_INSTANT_TRADE_PAY";

    public AlipayBean(String out_trade_no, int dsum, int dprice, int proid, String dtime, String duser, String subject, StringBuffer total_amount) {
        this.out_trade_no = out_trade_no;
        this.dsum = dsum;
        this.dprice = dprice;
        this.proid = proid;
        this.dtime = dtime;
        this.duser = duser;
        this.subject = subject;
        this.total_amount = total_amount;
    }

    public int getDsum() {
        return dsum;
    }

    public void setDsum(int dsum) {
        this.dsum = dsum;
    }

    public int getDprice() {
        return dprice;
    }

    public void setDprice(int dprice) {
        this.dprice = dprice;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    public String getDuser() {
        return duser;
    }

    public void setDuser(String duser) {
        this.duser = duser;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public StringBuffer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(StringBuffer total_amount) {
        this.total_amount = total_amount;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    @Override
    public String toString() {
        return "AlipayBean{" +
                "out_trade_no='" + out_trade_no + '\'' +
                ", dsum=" + dsum +
                ", dprice=" + dprice +
                ", proid=" + proid +
                ", dtime='" + dtime + '\'' +
                ", duser='" + duser + '\'' +
                ", subject='" + subject + '\'' +
                ", total_amount=" + total_amount +
                ", body='" + body + '\'' +
                ", timeout_express='" + timeout_express + '\'' +
                ", product_code='" + product_code + '\'' +
                '}';
    }
}

