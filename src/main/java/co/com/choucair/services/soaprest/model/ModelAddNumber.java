package co.com.choucair.services.soaprest.model;

public class ModelAddNumber {
    private int number_one;
    private int number_two;

    public ModelAddNumber(int number_one, int number_two) {
        this.number_one = number_one;
        this.number_two = number_two;
    }
    public int getNumber_one() {
        return number_one;
    }

    public void setNumber_one(int number_one) {
        this.number_one = number_one;
    }

    public int getNumber_two() {
        return number_two;
    }

    public void setNumber_two(int number_two) {
        this.number_two = number_two;
    }

    @Override
    public String toString() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " +
                "xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <Add xmlns=\"http://tempuri.org/\">\n" +
                "      <intA>"+ number_one +"</intA>\n" +
                "      <intB>" + number_two + "</intB>\n" +
                "    </Add>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
    }
}
