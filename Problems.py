# problemsolving/Problems.py
def add_binary_ones_complement(a, b):
    # Make both strings same length by adding leading 0s
    if len(a) < len(b):
        a = a.zfill(len(b))
    else:
        b = b.zfill(len(a))

    result = ''
    carry = 0
    # Add bits from right to left
    for i in range(len(a) - 1, -1, -1):
        total = carry + int(a[i]) + int(b[i])
        result = str(total % 2) + result
        carry = total // 2

    # Add carry if exists (1's complement rule)
    if carry:
        result = add_binary_ones_complement(result, '1')

    return result[-len(a):]  # Keep final length same

def ones_complement(binary_str):
    return ''.join('1' if bit == '0' else '0' for bit in binary_str)

# ----- USER INPUT -----
message = input("Enter binary message: ")

# Pad 0s at the end if not multiple of 8
if len(message) % 8 != 0:
    message += '0' * (8 - len(message) % 8)

# Split into 8-bit parts
parts = [message[i:i+8] for i in range(0, len(message), 8)]

# --- Sender: Add parts and create checksum ---
total = parts[0]
for i in range(1, len(parts)):
    total = add_binary_ones_complement(total, parts[i])

checksum = ones_complement(total)

print("\nSender Side:")
print("Final sum  :", total)
print("Checksum   :", checksum)

# --- Receiver: Add all including checksum ---
parts.append(checksum)
receiver_total = parts[0]
for i in range(1, len(parts)):
    receiver_total = add_binary_ones_complement(receiver_total, parts[i])

final_check = ones_complement(receiver_total)

print("\nReceiver Side:")
print("Sum + Checksum:", receiver_total)
print("Final Check   :", final_check)

if final_check == '0' * len(checksum):
    print("✅ No Error. Message accepted.")
else:
    print("❌ Error detected.")

