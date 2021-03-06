package protocolsupport.protocol.transformer.middlepacket.clientbound.play;

import protocolsupport.protocol.PacketDataSerializer;
import protocolsupport.protocol.transformer.middlepacket.ClientBoundMiddlePacket;

import java.io.IOException;

public abstract class MiddleKickDisconnect<T> extends ClientBoundMiddlePacket<T> {

	protected String messageJson;

	@Override
	public void readFromServerData(PacketDataSerializer serializer) throws IOException {
		messageJson = serializer.readString(Short.MAX_VALUE);
	}

}
