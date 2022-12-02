LocalData now = LocalData.now();
int year = now.getYear();

model.put("year", year);

JSONArray revenueArray = new JSONArray();
revenueArray.add(12);
revenueArray.add(22);
revenueArray.add(32);
revenueArray.add(42);
model.put("revenueArray", revenueArray);

JSONArray networthArray = new JSONArray();
networthArray.add(12);
networthArray.add(22);
networthArray.add(32);
networthArray.add(42);
model.put("networthArray", networthArray);

JSONArray freecashflowArray = new JSONArray();
freecashflowArray.add(12);
freecashflowArray.add(22);
freecashflowArray.add(32);
freecashflowArray.add(42);
model.put("freecashflowArray", freecashflowArray);