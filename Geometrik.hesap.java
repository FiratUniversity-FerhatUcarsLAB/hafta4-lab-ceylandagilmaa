import math  # Pi sayısını kullanabilmek için math modülünü içe aktarıyoruz

# Kullanıcıdan yarıçapı al
yaricap = float(input("Yarıçapı girin: "))

# Dairenin hesaplamaları
cevre = 2 * math.pi * yaricap
alan = math.pi * (yaricap ** 2)
cap = 2 * yaricap

# Kürenin hesaplamaları
hacim = (4/3) * math.pi * (yaricap ** 3)
yuzey_alan = 4 * math.pi * (yaricap ** 2)

# Sonuçları ekrana yazdır
print("\n--- Hesaplamalar ---")
print(f"Yarıçap    : {yaricap}")
print(f"Çap        : {cap}")
print(f"Dairenin Çevresi  : {cevre:.2f}")
print(f"Dairenin Alanı    : {alan:.2f}")
print(f"Kürenin Hacmi     : {hacim:.2f}")
print(f"Kürenin Yüzey Alanı: {yuzey_alan:.2f}")
