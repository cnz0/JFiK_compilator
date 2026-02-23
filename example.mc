struct car:
  price = 10000;
  name = "volkswagen";
  owned = true;
end

print(car);
print(car.get(price));
tmp = car.set(price = 1234);
print(car.get(price));