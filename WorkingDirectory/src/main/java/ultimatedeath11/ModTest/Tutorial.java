package ultimatedeath11.ModTest;

import net.minecraftforge.fml.common.Mod;



@Mod(modid = Reference.ModID, name = Reference.Name, version = Reference.Version, AcceptedMinecraftVersion = Reference.AcceptedVersions)
public class Tutorial {

	@Instance
	public static Tutorial instance;
	
	@sidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.ServerProxyClass)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitilazationEvent event){
		
	})
	
	
	
	
	
}
