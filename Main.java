import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // 从 jar 中读取脚本
            InputStream in = Main.class.getResourceAsStream("/start.sh");
            File file = File.createTempFile("start", ".sh");
            FileOutputStream out = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) != -1) out.write(buffer, 0, len);
            out.close();
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
