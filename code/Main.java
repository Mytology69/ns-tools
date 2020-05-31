public class Main extends JavaPLugin {
CommandExecutor nscmd = new nsCmd();
getCommand("ns-t").setExecutor(nscmd);
}
