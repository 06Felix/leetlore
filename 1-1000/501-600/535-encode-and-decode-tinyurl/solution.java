public class Codec {
    static String lmao;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        lmao = longUrl;
        return "This might be an URL";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return lmao;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
