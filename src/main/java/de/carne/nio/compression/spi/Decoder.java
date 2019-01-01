/*
 * Copyright (c) 2016-2019 Holger de Carne and contributors, All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.carne.nio.compression.spi;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/**
 * Base class for compression decoders
 */
public abstract class Decoder extends Compression {

	/**
	 * Construct {@linkplain Decoder}.
	 *
	 * @param name The compression name.
	 */
	protected Decoder(String name) {
		super(name);
	}

	/**
	 * Decode data.
	 *
	 * @param dst The {@linkplain ByteBuffer} receiving the decoded bytes.
	 * @param src The {@linkplain ReadableByteChannel} providing the encoded bytes.
	 * @return The number of decoded bytes or {@code -1} if the end of the encoded stream has been reached.
	 * @throws IOException if an I/O error occurs.
	 */
	public abstract int decode(ByteBuffer dst, ReadableByteChannel src) throws IOException;

}
