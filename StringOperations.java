public class StringOperations {
    public static void main(String[] args) {
        String name = "Siren";
        System.out.println(name);

        System.out.println(name.replace("S", "A"));
        System.out.println(name.replace("n", "Z"));

        String url = "www.name.tld";
        System.out.println(url);

        String url_middle = url.substring(4,8);
        int course = 1331;
        String course_str = String.valueOf(course);
        String new_url_middle = url_middle.concat(course_str);
        System.out.println(new_url_middle);

    }
}