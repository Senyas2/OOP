public class Main {
    public static void main(String[] args) {
        Adress a = new Adress();
        a.setIndex(03035);
        a.setCountry("Ukrain");
        a.setCity("Kiev");
        a.setStreet("Генерала Шаповала");
        a.setHouse("2");
        a.setApartament(304);
        System.out.println("Index - "+ a.getIndex());
        System.out.println("Country - " + a.getCountry());
        System.out.println("City - "+ a.getCity());
        System.out.println("Street - " + a.getStreet());
        System.out.println("House - " + a.getHouse());
        System.out.println("Apartament - " + a.getApartament());
    }
}
