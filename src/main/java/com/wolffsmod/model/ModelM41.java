package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelM41
  extends ModelVehicle 
  {
  int textureX = 512;
  int textureY = 512;

  
  public ModelM41() {
		bodyModel = new ModelRendererTurbo[287];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 234
		bodyModel[33] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 235
		bodyModel[34] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 236
		bodyModel[35] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 237
		bodyModel[36] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 238
		bodyModel[37] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 239
		bodyModel[38] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 240
		bodyModel[39] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 241
		bodyModel[40] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 242
		bodyModel[41] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 243
		bodyModel[42] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 244
		bodyModel[43] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 245
		bodyModel[44] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 246
		bodyModel[45] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 247
		bodyModel[46] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 248
		bodyModel[47] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 249
		bodyModel[48] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 250
		bodyModel[49] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 251
		bodyModel[50] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 252
		bodyModel[51] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 253
		bodyModel[52] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 254
		bodyModel[53] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 255
		bodyModel[54] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 256
		bodyModel[55] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 257
		bodyModel[56] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 258
		bodyModel[57] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 259
		bodyModel[58] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 260
		bodyModel[59] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 261
		bodyModel[60] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 262
		bodyModel[61] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 263
		bodyModel[62] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 264
		bodyModel[63] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 265
		bodyModel[64] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 266
		bodyModel[65] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 267
		bodyModel[66] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 268
		bodyModel[67] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 269
		bodyModel[68] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 270
		bodyModel[69] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 271
		bodyModel[70] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 272
		bodyModel[71] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 273
		bodyModel[72] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 274
		bodyModel[73] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 275
		bodyModel[74] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 276
		bodyModel[75] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 277
		bodyModel[76] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 278
		bodyModel[77] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 279
		bodyModel[78] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 280
		bodyModel[79] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 281
		bodyModel[80] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 282
		bodyModel[81] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 283
		bodyModel[82] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 284
		bodyModel[83] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 285
		bodyModel[84] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 286
		bodyModel[85] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 296
		bodyModel[86] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 297
		bodyModel[87] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 298
		bodyModel[88] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 302
		bodyModel[89] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 303
		bodyModel[90] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 304
		bodyModel[91] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 305
		bodyModel[92] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 306
		bodyModel[93] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 307
		bodyModel[94] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 308
		bodyModel[95] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 309
		bodyModel[96] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 310
		bodyModel[97] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 311
		bodyModel[98] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 312
		bodyModel[99] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 313
		bodyModel[100] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 314
		bodyModel[101] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 315
		bodyModel[102] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 316
		bodyModel[103] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 317
		bodyModel[104] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 318
		bodyModel[105] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 319
		bodyModel[106] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 320
		bodyModel[107] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 321
		bodyModel[108] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 322
		bodyModel[109] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 331
		bodyModel[110] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 332
		bodyModel[111] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 333
		bodyModel[112] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 334
		bodyModel[113] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 335
		bodyModel[114] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 336
		bodyModel[115] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 337
		bodyModel[116] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 338
		bodyModel[117] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 339
		bodyModel[118] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 340
		bodyModel[119] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 341
		bodyModel[120] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 342
		bodyModel[121] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 343
		bodyModel[122] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 344
		bodyModel[123] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 345
		bodyModel[124] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 346
		bodyModel[125] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 347
		bodyModel[126] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 348
		bodyModel[127] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 352
		bodyModel[128] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 353
		bodyModel[129] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 354
		bodyModel[130] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 355
		bodyModel[131] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 356
		bodyModel[132] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 357
		bodyModel[133] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 359
		bodyModel[134] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 362
		bodyModel[135] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 363
		bodyModel[136] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 364
		bodyModel[137] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 365
		bodyModel[138] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 366
		bodyModel[139] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 367
		bodyModel[140] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 368
		bodyModel[141] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 369
		bodyModel[142] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 373
		bodyModel[143] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 374
		bodyModel[144] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 375
		bodyModel[145] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 376
		bodyModel[146] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 377
		bodyModel[147] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 378
		bodyModel[148] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 379
		bodyModel[149] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 380
		bodyModel[150] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 381
		bodyModel[151] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 382
		bodyModel[152] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 383
		bodyModel[153] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 384
		bodyModel[154] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 385
		bodyModel[155] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 386
		bodyModel[156] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 387
		bodyModel[157] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 388
		bodyModel[158] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 389
		bodyModel[159] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 391
		bodyModel[160] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 392
		bodyModel[161] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 397
		bodyModel[162] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 398
		bodyModel[163] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 399
		bodyModel[164] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 400
		bodyModel[165] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 401
		bodyModel[166] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 402
		bodyModel[167] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 403
		bodyModel[168] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 404
		bodyModel[169] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 405
		bodyModel[170] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 406
		bodyModel[171] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 407
		bodyModel[172] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 408
		bodyModel[173] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 409
		bodyModel[174] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 410
		bodyModel[175] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 411
		bodyModel[176] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 412
		bodyModel[177] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 413
		bodyModel[178] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 414
		bodyModel[179] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 415
		bodyModel[180] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 416
		bodyModel[181] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 418
		bodyModel[182] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 419
		bodyModel[183] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 420
		bodyModel[184] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 425
		bodyModel[185] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 426
		bodyModel[186] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 427
		bodyModel[187] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 428
		bodyModel[188] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 429
		bodyModel[189] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 430
		bodyModel[190] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 431
		bodyModel[191] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 432
		bodyModel[192] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 433
		bodyModel[193] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 434
		bodyModel[194] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 435
		bodyModel[195] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 436
		bodyModel[196] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 437
		bodyModel[197] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 438
		bodyModel[198] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 439
		bodyModel[199] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 440
		bodyModel[200] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 441
		bodyModel[201] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 442
		bodyModel[202] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 443
		bodyModel[203] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 444
		bodyModel[204] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 445
		bodyModel[205] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 446
		bodyModel[206] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 447
		bodyModel[207] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 448
		bodyModel[208] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 449
		bodyModel[209] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 450
		bodyModel[210] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 451
		bodyModel[211] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 452
		bodyModel[212] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 453
		bodyModel[213] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 454
		bodyModel[214] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 455
		bodyModel[215] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 456
		bodyModel[216] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 457
		bodyModel[217] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 458
		bodyModel[218] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 459
		bodyModel[219] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 460
		bodyModel[220] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 461
		bodyModel[221] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 462
		bodyModel[222] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 463
		bodyModel[223] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 465
		bodyModel[224] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 466
		bodyModel[225] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 467
		bodyModel[226] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 468
		bodyModel[227] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 469
		bodyModel[228] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 470
		bodyModel[229] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 471
		bodyModel[230] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 472
		bodyModel[231] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 474
		bodyModel[232] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 475
		bodyModel[233] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 478
		bodyModel[234] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 479
		bodyModel[235] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 480
		bodyModel[236] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 481
		bodyModel[237] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 482
		bodyModel[238] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 483
		bodyModel[239] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 484
		bodyModel[240] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 485
		bodyModel[241] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 486
		bodyModel[242] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 487
		bodyModel[243] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 488
		bodyModel[244] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 489
		bodyModel[245] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 490
		bodyModel[246] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 491
		bodyModel[247] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 500
		bodyModel[248] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 501
		bodyModel[249] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 502
		bodyModel[250] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 806
		bodyModel[251] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 807
		bodyModel[252] = new ModelRendererTurbo(this, 65, 369, textureX, textureY); // Box 808
		bodyModel[253] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 809
		bodyModel[254] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 810
		bodyModel[255] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 952
		bodyModel[256] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 953
		bodyModel[257] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 954
		bodyModel[258] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 964
		bodyModel[259] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 815
		bodyModel[260] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 816
		bodyModel[261] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 817
		bodyModel[262] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 818
		bodyModel[263] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 819
		bodyModel[264] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 820
		bodyModel[265] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 821
		bodyModel[266] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 822
		bodyModel[267] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 823
		bodyModel[268] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 824
		bodyModel[269] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 825
		bodyModel[270] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 826
		bodyModel[271] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 827
		bodyModel[272] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 828
		bodyModel[273] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 829
		bodyModel[274] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 830
		bodyModel[275] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 831
		bodyModel[276] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 832
		bodyModel[277] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 833
		bodyModel[278] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 834
		bodyModel[279] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 835
		bodyModel[280] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 836
		bodyModel[281] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 837
		bodyModel[282] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 902
		bodyModel[283] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Box 905
		bodyModel[284] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 906
		bodyModel[285] = new ModelRendererTurbo(this, 41, 385, textureX, textureY); // Box 907
		bodyModel[286] = new ModelRendererTurbo(this, 73, 393, textureX, textureY); // Box 908

		bodyModel[0].addShapeBox(0F, 0F, 0F, 14, 8, 36, 0F, -0.5F, -0.4F, 0F, 0F, -7.9F, 0F, 0F, -7.9F, -0.5F, -0.5F, -0.4F, -0.5F, -9.2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -9.2F, 5F, -0.5F); // Box 0
		bodyModel[0].setRotationPoint(28.6F, -18.3F, -17.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 13, 36, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 8.7F, 0F, 0F, 8.7F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1
		bodyModel[1].setRotationPoint(26.1F, -18.3F, -17.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 13, 14, 0F, 0F, 2.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, 2.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[2].setRotationPoint(22.1F, -18.3F, -6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 13, 6, 0F, 1.8F, 2.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, 2.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 3
		bodyModel[3].setRotationPoint(22.1F, -18.3F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 13, 6, 0F, 3.9F, 2.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -0.2F, 2.4F, -0.5F, 3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(20.1F, -18.3F, -17.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 13, 6, 0F, 4.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 3.9F, -0.4F, 0F, 3.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 3.9F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(20.1F, -18.3F, 12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 13, 6, 0F, 5.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 5.8F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(22.1F, -18.3F, 6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F, 2.3F, 2.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 2.3F, 2.4F, 0F, 2.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2.3F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(15.2F, -18.3F, 14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 50, 13, 36, 0F, 2.2F, 2.4F, -0.5F, 0F, 2.4F, -0.5F, 0F, 2.4F, 0F, 2.2F, 2.4F, 0F, 2.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2.2F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-37.1F, -18.3F, -18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F, 2.3F, 2.4F, -0.5F, 0F, 2.4F, -0.5F, 4.1F, 2.4F, 0F, 2.3F, 2.4F, 0F, 2.3F, 0F, -0.5F, 0F, 0F, -0.5F, 4.1F, 0F, 0F, 2.3F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(15.2F, -18.3F, -18F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F, 2.3F, 2.4F, -0.5F, 2.1F, 2.4F, -0.5F, 3.9F, 2.4F, 0F, 2.3F, 2.4F, 0F, 2.3F, 0F, -0.5F, 2.1F, 0F, -0.5F, 3.9F, 0F, 0F, 2.3F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(15.2F, -18.3F, -12.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 13, 14, 0F, 2.3F, 2.4F, -0.5F, 3.9F, 2.4F, -0.5F, 3.9F, 2.4F, 0F, 2.3F, 2.4F, 0F, 2.3F, 0F, -0.5F, 3.9F, 0F, -0.5F, 3.9F, 0F, 0F, 2.3F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(15.2F, -18.3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 13, 8, 0F, 2.3F, 2.4F, -0.5F, 3.9F, 2.4F, -0.5F, -3.2F, 2.4F, 0.5F, 2.3F, 2.4F, 0.5F, 2.3F, 0F, -0.5F, 3.9F, 0F, -0.5F, 1.9F, 0F, 0.5F, 2.3F, 0F, 0.5F); // Box 12
		bodyModel[12].setRotationPoint(15.2F, -18.3F, 6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F); // Box 13
		bodyModel[13].setRotationPoint(12F, -20.7F, 15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 13, 36, 0F, 2F, 0.45F, -0.5F, -0.2F, 2.4F, -0.5F, -0.2F, 2.4F, 0F, 2F, 0.45F, 0F, 2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 2F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-46.1F, -18.3F, -18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 10, 36, 0F, 2F, -2.55F, -0.5F, -0.2F, 2.4F, -0.5F, -0.2F, 2.4F, 0F, 2F, -2.55F, 0F, 2F, -7F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, 0F, 2F, -7F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-53.9F, -16.35F, -18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 72, 3, 18, 0F, 2.2F, 2.4F, -0.5F, 0F, 2.4F, -0.5F, 0F, 2.4F, 0.5F, 2.2F, 2.4F, 0.5F, 2.2F, -1F, -9.5F, 0F, -1F, -9.5F, 0F, -0.5F, 0.5F, 2.2F, -0.5F, 0.5F); // Box 16
		bodyModel[16].setRotationPoint(-39.1F, -2.9F, -18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 72, 3, 18, 0F, 2.2F, 2.4F, 0.5F, 0F, 2.4F, 0.5F, 0F, 2.4F, -1F, 2.2F, 2.4F, -1F, 2.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -9.5F, 2.2F, -1F, -9.5F); // Box 17
		bodyModel[17].setRotationPoint(-39.1F, -2.9F, 1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F, 2F, 2.4F, 0.5F, -0.1F, 2.4F, 0.5F, -0.1F, 2.4F, -1F, 2F, 2.4F, -1F, 2F, -0.5F, 0.5F, -5F, -0.5F, 0.5F, -5F, -1F, -9.5F, 2F, -1F, -9.5F); // Box 18
		bodyModel[18].setRotationPoint(34.9F, -2.9F, 1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F, 2F, 2.4F, -0.5F, -0.1F, 2.4F, -0.5F, -0.1F, 2.4F, 0.5F, 2F, 2.4F, 0.5F, 2F, -1F, -9.5F, -5F, -1F, -9.5F, -5F, -0.5F, 0.5F, 2F, -0.5F, 0.5F); // Box 19
		bodyModel[19].setRotationPoint(34.9F, -2.9F, -18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F, -0.2F, 2.4F, 0.5F, 2F, 2.4F, 0.5F, 2F, 2.4F, -1F, -0.2F, 2.4F, -1F, -5F, -0.5F, 0.5F, 2F, -0.5F, 0.5F, 2F, -1F, -9.5F, -5F, -1F, -9.5F); // Box 20
		bodyModel[20].setRotationPoint(-48.3F, -2.9F, 1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F, -0.2F, 2.4F, -0.5F, 2F, 2.4F, -0.5F, 2F, 2.4F, 0.5F, -0.2F, 2.4F, 0.5F, -5F, -1F, -9.5F, 2F, -1F, -9.5F, 2F, -0.5F, 0.5F, -5F, -0.5F, 0.5F); // Box 21
		bodyModel[21].setRotationPoint(-48.3F, -2.9F, -18F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 84, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-48.5F, -16.4F, -28.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 84, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-48.5F, -16.4F, 18F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-52.5F, -16.4F, -28.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F); // Box 25
		bodyModel[25].setRotationPoint(-56.5F, -15.4F, -28.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F); // Box 26
		bodyModel[26].setRotationPoint(-56.5F, -15.4F, 18F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-52.5F, -16.4F, 18F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(35.5F, -16.4F, -28.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(39.5F, -15.4F, -28.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(39.5F, -15.4F, 18F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(35.5F, -16.4F, 18F);

		bodyModel[32].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 234
		bodyModel[32].setRotationPoint(34.7F, -2.8F, 9F);

		bodyModel[33].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 235
		bodyModel[33].setRotationPoint(20.7F, -2.8F, 9F);

		bodyModel[34].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 236
		bodyModel[34].setRotationPoint(5.7F, -2.8F, 9F);

		bodyModel[35].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 237
		bodyModel[35].setRotationPoint(-9.3F, -2.8F, 9F);

		bodyModel[36].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 238
		bodyModel[36].setRotationPoint(-24.3F, -2.8F, 9F);

		bodyModel[37].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 239
		bodyModel[37].setRotationPoint(-24.3F, -2.8F, -17F);

		bodyModel[38].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 240
		bodyModel[38].setRotationPoint(-9.3F, -2.8F, -17F);

		bodyModel[39].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 241
		bodyModel[39].setRotationPoint(5.7F, -2.8F, -17F);

		bodyModel[40].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 242
		bodyModel[40].setRotationPoint(20.7F, -2.8F, -17F);

		bodyModel[41].addShapeBox(-6F, -1F, 0F, 3, 3, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 243
		bodyModel[41].setRotationPoint(34.7F, -2.8F, -17F);

		bodyModel[42].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 244
		bodyModel[42].setRotationPoint(-11.3F, -2.8F, -19F);

		bodyModel[43].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, -1F, 4.8F, 0.8F, 1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, -1F); // Box 245
		bodyModel[43].setRotationPoint(-11.3F, -1.8F, -19F);

		bodyModel[44].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, -1F, 4.8F, 0.8F, 1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, -1F); // Box 246
		bodyModel[44].setRotationPoint(3.7F, -1.8F, -19F);

		bodyModel[45].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 247
		bodyModel[45].setRotationPoint(3.7F, -2.8F, -19F);

		bodyModel[46].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, -1F, 4.8F, 0.8F, 1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, -1F); // Box 248
		bodyModel[46].setRotationPoint(18.7F, -1.8F, -19F);

		bodyModel[47].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 249
		bodyModel[47].setRotationPoint(18.7F, -2.8F, -19F);

		bodyModel[48].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, -1F, 4.8F, 0.8F, 1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, -1F); // Box 250
		bodyModel[48].setRotationPoint(-26.3F, -1.8F, -19F);

		bodyModel[49].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 251
		bodyModel[49].setRotationPoint(-26.3F, -2.8F, -19F);

		bodyModel[50].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, -1F, 4.8F, 0.8F, 1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, -1F); // Box 252
		bodyModel[50].setRotationPoint(32.7F, -1.8F, -19F);

		bodyModel[51].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 253
		bodyModel[51].setRotationPoint(32.7F, -2.8F, -19F);

		bodyModel[52].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, 1F, 4.8F, 0.8F, -1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, 1F); // Box 254
		bodyModel[52].setRotationPoint(-22.3F, -1.8F, 19F);

		bodyModel[53].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 255
		bodyModel[53].setRotationPoint(-22.3F, -2.8F, 18F);

		bodyModel[54].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, 1F, 4.8F, 0.8F, -1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, 1F); // Box 256
		bodyModel[54].setRotationPoint(-7.3F, -1.8F, 19F);

		bodyModel[55].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 257
		bodyModel[55].setRotationPoint(-7.3F, -2.8F, 18F);

		bodyModel[56].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, 1F, 4.8F, 0.8F, -1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, 1F); // Box 258
		bodyModel[56].setRotationPoint(7.7F, -1.8F, 19F);

		bodyModel[57].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 259
		bodyModel[57].setRotationPoint(7.7F, -2.8F, 18F);

		bodyModel[58].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, 1F, 4.8F, 0.8F, -1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, 1F); // Box 260
		bodyModel[58].setRotationPoint(22.7F, -1.8F, 19F);

		bodyModel[59].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 261
		bodyModel[59].setRotationPoint(22.7F, -2.8F, 18F);

		bodyModel[60].addShapeBox(-6F, -1F, 0F, 2, 3, 1, 0F, 4.8F, -2.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 4.8F, -2.2F, 1F, 4.8F, 0.8F, -1F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 4.8F, 0.8F, 1F); // Box 262
		bodyModel[60].setRotationPoint(37.7F, -1.8F, 19F);

		bodyModel[61].addShapeBox(-6F, -1F, 0F, 3, 3, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 263
		bodyModel[61].setRotationPoint(37.7F, -2.8F, 18F);

		bodyModel[62].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 264
		bodyModel[62].setRotationPoint(0.7F, -3.6F, 18F);

		bodyModel[63].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 265
		bodyModel[63].setRotationPoint(1.3F, -2.6F, 18.5F);

		bodyModel[64].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 266
		bodyModel[64].setRotationPoint(15.3F, -2.6F, 18.5F);

		bodyModel[65].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 267
		bodyModel[65].setRotationPoint(14.7F, -3.6F, 18F);

		bodyModel[66].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 268
		bodyModel[66].setRotationPoint(30.3F, -2.6F, 18.5F);

		bodyModel[67].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 269
		bodyModel[67].setRotationPoint(29.7F, -3.6F, 18F);

		bodyModel[68].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 270
		bodyModel[68].setRotationPoint(-12.7F, -2.6F, 18.5F);

		bodyModel[69].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 271
		bodyModel[69].setRotationPoint(-13.3F, -3.6F, 18F);

		bodyModel[70].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 272
		bodyModel[70].setRotationPoint(-28.7F, -2.6F, 18.5F);

		bodyModel[71].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 273
		bodyModel[71].setRotationPoint(-29.3F, -3.6F, 18F);

		bodyModel[72].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 274
		bodyModel[72].setRotationPoint(-29.7F, -2.6F, -19F);

		bodyModel[73].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 275
		bodyModel[73].setRotationPoint(-30.3F, -3.6F, -19.5F);

		bodyModel[74].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 276
		bodyModel[74].setRotationPoint(-15.3F, -3.6F, -19.5F);

		bodyModel[75].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 277
		bodyModel[75].setRotationPoint(-14.7F, -2.6F, -19F);

		bodyModel[76].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 278
		bodyModel[76].setRotationPoint(-0.3F, -3.6F, -19.5F);

		bodyModel[77].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 279
		bodyModel[77].setRotationPoint(0.300000000000001F, -2.6F, -19F);

		bodyModel[78].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[78].setRotationPoint(13.7F, -3.6F, -19.5F);

		bodyModel[79].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[79].setRotationPoint(14.3F, -2.6F, -19F);

		bodyModel[80].addShapeBox(-6F, -4.7F, 0F, 7, 2, 2, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 282
		bodyModel[80].setRotationPoint(27.7F, -3.6F, -19.5F);

		bodyModel[81].addShapeBox(-6F, -4.7F, 0F, 6, 4, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 283
		bodyModel[81].setRotationPoint(28.3F, -2.6F, -19F);

		bodyModel[82].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 284
		bodyModel[82].setRotationPoint(19.9F, -9.9F, 21F);

		bodyModel[83].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 285
		bodyModel[83].setRotationPoint(19.9F, -8.5F, 21F);

		bodyModel[84].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 286
		bodyModel[84].setRotationPoint(19.9F, -11.3F, 21F);

		bodyModel[85].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 296
		bodyModel[85].setRotationPoint(-5.1F, -11.3F, 21F);

		bodyModel[86].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 297
		bodyModel[86].setRotationPoint(-5.1F, -9.9F, 21F);

		bodyModel[87].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 298
		bodyModel[87].setRotationPoint(-5.1F, -8.5F, 21F);

		bodyModel[88].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 302
		bodyModel[88].setRotationPoint(-23.1F, -11.3F, 21F);

		bodyModel[89].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 303
		bodyModel[89].setRotationPoint(-23.1F, -9.9F, 21F);

		bodyModel[90].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 304
		bodyModel[90].setRotationPoint(-23.1F, -8.5F, 21F);

		bodyModel[91].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 305
		bodyModel[91].setRotationPoint(20.3F, -9.7F, 16F);

		bodyModel[92].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 306
		bodyModel[92].setRotationPoint(20.3F, -9.7F, 16F);

		bodyModel[93].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 307
		bodyModel[93].setRotationPoint(20.3F, -9.7F, 16F);

		bodyModel[94].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 308
		bodyModel[94].setRotationPoint(5.3F, -9.7F, 16F);

		bodyModel[95].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 309
		bodyModel[95].setRotationPoint(5.3F, -9.7F, 16F);

		bodyModel[96].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 310
		bodyModel[96].setRotationPoint(5.3F, -9.7F, 16F);

		bodyModel[97].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 311
		bodyModel[97].setRotationPoint(-38.5F, -9.7F, 16F);

		bodyModel[98].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 312
		bodyModel[98].setRotationPoint(-38.5F, -9.7F, 16F);

		bodyModel[99].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 313
		bodyModel[99].setRotationPoint(-38.5F, -9.7F, 16F);

		bodyModel[100].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 314
		bodyModel[100].setRotationPoint(-27.5F, -9.7F, 17F);

		bodyModel[101].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 315
		bodyModel[101].setRotationPoint(-27.5F, -9.7F, 17F);

		bodyModel[102].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 316
		bodyModel[102].setRotationPoint(-27.5F, -9.7F, 17F);

		bodyModel[103].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 317
		bodyModel[103].setRotationPoint(-9.5F, -9.7F, 17F);

		bodyModel[104].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 318
		bodyModel[104].setRotationPoint(-9.5F, -9.7F, 17F);

		bodyModel[105].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 319
		bodyModel[105].setRotationPoint(-9.5F, -9.7F, 17F);

		bodyModel[106].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 320
		bodyModel[106].setRotationPoint(15.5F, -9.7F, 17F);

		bodyModel[107].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 321
		bodyModel[107].setRotationPoint(15.5F, -9.7F, 17F);

		bodyModel[108].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 322
		bodyModel[108].setRotationPoint(15.5F, -9.7F, 17F);

		bodyModel[109].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 331
		bodyModel[109].setRotationPoint(4.3F, -9.7F, -20F);

		bodyModel[110].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 332
		bodyModel[110].setRotationPoint(4.3F, -9.7F, -20F);

		bodyModel[111].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 333
		bodyModel[111].setRotationPoint(4.3F, -9.7F, -20F);

		bodyModel[112].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 334
		bodyModel[112].setRotationPoint(19.3F, -9.7F, -20F);

		bodyModel[113].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 335
		bodyModel[113].setRotationPoint(19.3F, -9.7F, -20F);

		bodyModel[114].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 336
		bodyModel[114].setRotationPoint(19.3F, -9.7F, -20F);

		bodyModel[115].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 337
		bodyModel[115].setRotationPoint(-39.5F, -9.7F, -20F);

		bodyModel[116].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 338
		bodyModel[116].setRotationPoint(-39.5F, -9.7F, -20F);

		bodyModel[117].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 339
		bodyModel[117].setRotationPoint(-39.5F, -9.7F, -20F);

		bodyModel[118].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 340
		bodyModel[118].setRotationPoint(40.9F, -5.5F, 18F);

		bodyModel[119].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 341
		bodyModel[119].setRotationPoint(40.9F, -6.9F, 18F);

		bodyModel[120].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 342
		bodyModel[120].setRotationPoint(40.9F, -8.3F, 18F);

		bodyModel[121].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 343
		bodyModel[121].setRotationPoint(40.9F, -5.5F, -21.5F);

		bodyModel[122].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 344
		bodyModel[122].setRotationPoint(40.9F, -6.9F, -21.5F);

		bodyModel[123].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 345
		bodyModel[123].setRotationPoint(40.9F, -8.3F, -21.5F);

		bodyModel[124].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 346
		bodyModel[124].setRotationPoint(-40.1F, -5.5F, -21.5F);

		bodyModel[125].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 347
		bodyModel[125].setRotationPoint(-40.1F, -6.9F, -21.5F);

		bodyModel[126].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 348
		bodyModel[126].setRotationPoint(-40.1F, -8.3F, -21.5F);

		bodyModel[127].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 352
		bodyModel[127].setRotationPoint(19.9F, -8.5F, -24F);

		bodyModel[128].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 353
		bodyModel[128].setRotationPoint(19.9F, -9.9F, -24F);

		bodyModel[129].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 354
		bodyModel[129].setRotationPoint(19.9F, -11.3F, -24F);

		bodyModel[130].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 355
		bodyModel[130].setRotationPoint(15.5F, -9.7F, -21F);

		bodyModel[131].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 356
		bodyModel[131].setRotationPoint(15.5F, -9.7F, -21F);

		bodyModel[132].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 357
		bodyModel[132].setRotationPoint(15.5F, -9.7F, -21F);

		bodyModel[133].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 359
		bodyModel[133].setRotationPoint(-5.1F, -11.3F, -24F);

		bodyModel[134].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 362
		bodyModel[134].setRotationPoint(-5.1F, -9.9F, -24F);

		bodyModel[135].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 363
		bodyModel[135].setRotationPoint(-5.1F, -8.5F, -24F);

		bodyModel[136].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 364
		bodyModel[136].setRotationPoint(-9.5F, -9.7F, -21F);

		bodyModel[137].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 365
		bodyModel[137].setRotationPoint(-9.5F, -9.7F, -21F);

		bodyModel[138].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 366
		bodyModel[138].setRotationPoint(-9.5F, -9.7F, -21F);

		bodyModel[139].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 367
		bodyModel[139].setRotationPoint(-23.1F, -11.3F, -24F);

		bodyModel[140].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 368
		bodyModel[140].setRotationPoint(-23.1F, -9.9F, -24F);

		bodyModel[141].addShapeBox(-6F, -1F, 0F, 5, 2, 4, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 369
		bodyModel[141].setRotationPoint(-23.1F, -8.5F, -24F);

		bodyModel[142].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 373
		bodyModel[142].setRotationPoint(-27.5F, -9.7F, -21F);

		bodyModel[143].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 374
		bodyModel[143].setRotationPoint(-27.5F, -9.7F, -21F);

		bodyModel[144].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 375
		bodyModel[144].setRotationPoint(-27.5F, -9.7F, -21F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.3F, 2.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0.3F, 2.4F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 376
		bodyModel[145].setRotationPoint(27.1F, -18.3F, 7.2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0.3F, 2.35F, -0.5F, 0F, 2.35F, -0.5F, 0F, 2.35F, -0.5F, 5.65F, 2.35F, 0.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 5.65F, 0F, 0.5F); // Box 377
		bodyModel[146].setRotationPoint(21.8F, -18.35F, 7.2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0.3F, 2.35F, -0.5F, -5F, 2.35F, 0.5F, 0F, 2.35F, -0.5F, 0.3F, 2.35F, -0.5F, 0.3F, 0F, -0.5F, -2F, 0F, -0.5F, 2.75F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 378
		bodyModel[147].setRotationPoint(21.8F, -18.35F, 2.2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 5.65F, 2.35F, -1.5F, 0F, 2.35F, -0.5F, -3F, 2.35F, -0.5F, -0.25F, 2.35F, -0.5F, 6.3F, 0F, -3.5F, 2.75F, 0F, -0.5F, -1.2F, 0F, 0.6F, 2F, 0F, 0.5F); // Box 379
		bodyModel[148].setRotationPoint(21.8F, -18.35F, 12.2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 380
		bodyModel[149].setRotationPoint(26.7F, -19.6F, 7.6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.3F, -0.2F, -0.5F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 381
		bodyModel[150].setRotationPoint(26.7F, -20.6F, 7.6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 382
		bodyModel[151].setRotationPoint(26.9F, -19.6F, 7.8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 383
		bodyModel[152].setRotationPoint(26.9F, -19.6F, 11.4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 384
		bodyModel[153].setRotationPoint(24.5F, -19.6F, 15.7F);
		bodyModel[153].rotateAngleY = 0.64577182F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.3F, -0.2F, -0.5F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 385
		bodyModel[154].setRotationPoint(26.7F, -20.6F, 12.6F);
		bodyModel[154].rotateAngleY = 0.64577182F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 386
		bodyModel[155].setRotationPoint(26.7F, -19.6F, 12.6F);
		bodyModel[155].rotateAngleY = 0.64577182F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 387
		bodyModel[156].setRotationPoint(26.7F, -19.6F, 12.85F);
		bodyModel[156].rotateAngleY = 0.64577182F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 388
		bodyModel[157].setRotationPoint(25.2F, -20.6F, 2.6F);
		bodyModel[157].rotateAngleY = 0.85521133F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 389
		bodyModel[158].setRotationPoint(25.2F, -19.6F, 2.6F);
		bodyModel[158].rotateAngleY = 0.85521133F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 391
		bodyModel[159].setRotationPoint(25.5F, -19.6F, 2.6F);
		bodyModel[159].rotateAngleY = 0.85521133F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 392
		bodyModel[160].setRotationPoint(27.9F, -19.6F, 5.3F);
		bodyModel[160].rotateAngleY = 0.85521133F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 397
		bodyModel[161].setRotationPoint(20.6F, -19.6F, 15.63F);
		bodyModel[161].rotateAngleY = 0.48869219F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 398
		bodyModel[162].setRotationPoint(17.2F, -20.6F, 14F);
		bodyModel[162].rotateAngleY = 0.48869219F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 399
		bodyModel[163].setRotationPoint(17.4F, -19.6F, 13.6F);
		bodyModel[163].rotateAngleY = 0.48869219F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 400
		bodyModel[164].setRotationPoint(17.55F, -19.6F, 13.8F);
		bodyModel[164].rotateAngleY = 0.48869219F;

		bodyModel[165].addBox(0F, 0F, 0F, 29, 4, 10, 0F); // Box 401
		bodyModel[165].setRotationPoint(-27.5F, -20.4F, 18.55F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[166].setRotationPoint(1.9F, -20.4F, 18.55F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[167].setRotationPoint(-44.5F, -19.4F, 19F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[168].setRotationPoint(-48.5F, -19.4F, 19F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[169].setRotationPoint(-44.5F, -19.4F, -28F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[170].setRotationPoint(-48.5F, -19.4F, -28F);

		bodyModel[171].addBox(0F, 0F, 0F, 29, 4, 10, 0F); // Box 407
		bodyModel[171].setRotationPoint(-27.5F, -20.4F, -28F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[172].setRotationPoint(1.9F, -20.4F, -28F);

		bodyModel[173].addBox(0F, 0F, 0F, 21, 4, 6, 0F); // Box 409
		bodyModel[173].setRotationPoint(-24.3F, -20.6F, 20.6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F, 0F, -0.15F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[174].setRotationPoint(4.7F, -20.6F, 20.6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 411
		bodyModel[175].setRotationPoint(-23.3F, -20.6F, 20.2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 412
		bodyModel[176].setRotationPoint(-14.3F, -20.6F, 20.2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 413
		bodyModel[177].setRotationPoint(-6.3F, -20.6F, 20.2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 414
		bodyModel[178].setRotationPoint(-9.3F, -20.6F, 25.7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 415
		bodyModel[179].setRotationPoint(-21.3F, -20.6F, 25.7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 416
		bodyModel[180].setRotationPoint(5.7F, -20.2F, 25.7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 418
		bodyModel[181].setRotationPoint(12.7F, -18.7F, 25.7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 419
		bodyModel[182].setRotationPoint(14.7F, -18.4F, 20.2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 420
		bodyModel[183].setRotationPoint(4.7F, -20.4F, 20.2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 425
		bodyModel[184].setRotationPoint(-6.3F, -20.6F, -20.8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 426
		bodyModel[185].setRotationPoint(-9.3F, -20.6F, -26.3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 427
		bodyModel[186].setRotationPoint(-21.3F, -20.6F, -26.3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 428
		bodyModel[187].setRotationPoint(-14.3F, -20.6F, -20.8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 429
		bodyModel[188].setRotationPoint(-23.3F, -20.6F, -20.8F);

		bodyModel[189].addBox(0F, 0F, 0F, 21, 4, 6, 0F); // Box 430
		bodyModel[189].setRotationPoint(-24.3F, -20.6F, -26.4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F, 0F, -0.15F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[190].setRotationPoint(4.7F, -20.6F, -26.4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 432
		bodyModel[191].setRotationPoint(4.7F, -20.4F, -20.8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 433
		bodyModel[192].setRotationPoint(14.7F, -18.4F, -20.8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 434
		bodyModel[193].setRotationPoint(12.7F, -18.7F, -26.3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 435
		bodyModel[194].setRotationPoint(5.7F, -20.2F, -26.3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 436
		bodyModel[195].setRotationPoint(-52.5F, -18.4F, -24.3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 437
		bodyModel[196].setRotationPoint(-52.5F, -18.4F, 23F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 438
		bodyModel[197].setRotationPoint(-38F, -21.4F, 6.6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 439
		bodyModel[198].setRotationPoint(-38F, -21.4F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 440
		bodyModel[199].setRotationPoint(-38F, -21.4F, -16.7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 441
		bodyModel[200].setRotationPoint(19.7F, -18.4F, 18.1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 5.7F, -1.9F, 0F, -6.3F, -1.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 5.7F, 0F, 0F, -6.3F, 0F, 0F); // Box 442
		bodyModel[201].setRotationPoint(28.7F, -18.4F, 18.1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -0.3F, -1.9F, 0F, -0.3F, -1.9F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 443
		bodyModel[202].setRotationPoint(19.7F, -18.4F, -27F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -6.3F, -1.9F, 0F, 5.7F, -1.9F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -6.3F, 0F, 0F, 5.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 444
		bodyModel[203].setRotationPoint(28.7F, -18.4F, -27.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 2.35F, 0F, 0F, 2.35F, 0F, 0F, 2.35F, 0F, 0F, 2.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[204].setRotationPoint(18.5F, -18.6F, 8.2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 2.35F, 0F, 0F, 2.35F, 0F, -1.8F, 2.35F, 0F, -1.8F, 2.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F); // Box 446
		bodyModel[205].setRotationPoint(18.5F, -18.6F, 13.2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, -1.8F, 2.35F, 0F, -3F, 2.35F, 0F, 0F, 2.35F, 0F, 0F, 2.35F, 0F, -1.8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[206].setRotationPoint(18.5F, -18.6F, 4.2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 2F, 0.45F, -0.5F, -0.2F, 0.8F, -0.5F, -0.2F, 0.8F, 0F, 2F, 0.45F, 0F, 2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 2F, 0F, 0F); // Box 448
		bodyModel[207].setRotationPoint(-41.1F, -19.9F, 3.8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 2F, 0.45F, -0.5F, -0.2F, 0.8F, -0.5F, -0.2F, 0.8F, 0F, 2F, 0.45F, 0F, 2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 2F, 0F, 0F); // Box 449
		bodyModel[208].setRotationPoint(-41.1F, -19.9F, -8.2F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 2F, -0.2F, -0.5F, -0.2F, 1.2F, -0.5F, -0.2F, 1F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 2F, 0F, 0F); // Box 450
		bodyModel[209].setRotationPoint(-47.7F, -18.4F, -4.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[210].setRotationPoint(-36.5F, -21.3F, -17.2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[211].setRotationPoint(-30.5F, -21.3F, -17.2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[212].setRotationPoint(-24.5F, -21.3F, -17.2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 454
		bodyModel[213].setRotationPoint(-24.5F, -21.3F, 6.9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[214].setRotationPoint(-30.5F, -21.3F, 6.9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[215].setRotationPoint(-36.5F, -21.3F, 6.9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 457
		bodyModel[216].setRotationPoint(-20.5F, -21.8F, -17.4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 458
		bodyModel[217].setRotationPoint(-39F, -21F, -20.4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 459
		bodyModel[218].setRotationPoint(-39F, -21F, -21.4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F); // Box 460
		bodyModel[219].setRotationPoint(-39F, -21F, -18.4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 461
		bodyModel[220].setRotationPoint(-37.8F, -20F, -22F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 462
		bodyModel[221].setRotationPoint(-36.7F, -21.1F, -20.4F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F); // Box 463
		bodyModel[222].setRotationPoint(-41F, -21F, -20F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F); // Box 465
		bodyModel[223].setRotationPoint(-32F, -21F, -19F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.6F, -0.1F, 0.2F, -0.6F, -0.1F); // Box 466
		bodyModel[224].setRotationPoint(-20F, -21F, -19F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 467
		bodyModel[225].setRotationPoint(39F, -16.4F, -17.2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 468
		bodyModel[226].setRotationPoint(39F, -16.4F, -10.2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 469
		bodyModel[227].setRotationPoint(39F, -16.4F, 16.8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 470
		bodyModel[228].setRotationPoint(39F, -16.4F, 9.8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F); // Box 471
		bodyModel[229].setRotationPoint(39F, -17F, -17.2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F); // Box 472
		bodyModel[230].setRotationPoint(39F, -17F, 9.8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 474
		bodyModel[231].setRotationPoint(36F, -17F, -15.7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 475
		bodyModel[232].setRotationPoint(34F, -14.93F, -15.7F);
		bodyModel[232].rotateAngleZ = 0.78539816F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, 4F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F); // Box 478
		bodyModel[233].setRotationPoint(-50.7F, -6.4F, -7.1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, 4F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F); // Box 479
		bodyModel[234].setRotationPoint(-50.7F, -6.4F, 6.2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 480
		bodyModel[235].setRotationPoint(-52.2F, -5.6F, 6.2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 481
		bodyModel[236].setRotationPoint(-52.2F, -5.6F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 482
		bodyModel[237].setRotationPoint(-52.2F, -5.6F, 7.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 483
		bodyModel[238].setRotationPoint(-52.2F, -5.6F, -8.1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 4F, -0.3F, 2F, -0.2F, -0.3F, 2F, -0.2F, 0F, 0F, 4F, 0F, 0F, -1F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, -1F, 0F); // Box 484
		bodyModel[239].setRotationPoint(34.3F, -6.4F, 6.2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 485
		bodyModel[240].setRotationPoint(38.8F, -5.6F, 6.2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 486
		bodyModel[241].setRotationPoint(38.8F, -5.6F, 7.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 4F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F); // Box 487
		bodyModel[242].setRotationPoint(34.3F, -6.4F, -7.1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 488
		bodyModel[243].setRotationPoint(38.8F, -5.6F, -7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 489
		bodyModel[244].setRotationPoint(38.8F, -5.6F, -8.1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 490
		bodyModel[245].setRotationPoint(-50.7F, -7.4F, -1.8F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 491
		bodyModel[246].setRotationPoint(-53.5F, -7.4F, -1.2F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.35F, 0F); // Box 500
		bodyModel[247].setRotationPoint(-56F, -7.4F, -0.2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 501
		bodyModel[248].setRotationPoint(-56.5F, -12.9F, -17F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 502
		bodyModel[249].setRotationPoint(-56.5F, -12.9F, 15.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 2F, -0.2F, -0.5F, -0.2F, 1.2F, -0.5F, -0.2F, 1.2F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 2F, 0F, 0F); // Box 806
		bodyModel[250].setRotationPoint(-52.7F, -15.4F, -17.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 2F, -0.2F, -0.5F, -0.2F, 1.2F, -0.5F, -0.2F, 1.2F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 2F, 0F, 0F); // Box 807
		bodyModel[251].setRotationPoint(-52.7F, -15.4F, 10.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 18, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		bodyModel[252].setRotationPoint(-37F, -21.65F, -4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		bodyModel[253].setRotationPoint(-37F, -21.65F, -16F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		bodyModel[254].setRotationPoint(-37F, -21.65F, 7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 952
		bodyModel[255].setRotationPoint(37F, -15.65F, 14F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 953
		bodyModel[256].setRotationPoint(37F, -14.65F, 14F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 954
		bodyModel[257].setRotationPoint(37F, -13.65F, 14F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 964
		bodyModel[258].setRotationPoint(36.8F, -14.65F, 14.8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 815
		bodyModel[259].setRotationPoint(36.8F, -14.65F, 11.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 816
		bodyModel[260].setRotationPoint(37F, -13.65F, 10.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 817
		bodyModel[261].setRotationPoint(37F, -14.65F, 10.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 818
		bodyModel[262].setRotationPoint(37F, -15.65F, 10.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 819
		bodyModel[263].setRotationPoint(37F, -15.65F, -13F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 820
		bodyModel[264].setRotationPoint(37F, -14.65F, -13F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 821
		bodyModel[265].setRotationPoint(37F, -13.65F, -13F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 822
		bodyModel[266].setRotationPoint(37F, -13.65F, -16.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 823
		bodyModel[267].setRotationPoint(37F, -14.65F, -16.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 824
		bodyModel[268].setRotationPoint(37F, -15.65F, -16.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 825
		bodyModel[269].setRotationPoint(36.8F, -14.65F, -15.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 826
		bodyModel[270].setRotationPoint(36F, -17F, -11.7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 827
		bodyModel[271].setRotationPoint(34F, -14.93F, -11.7F);
		bodyModel[271].rotateAngleZ = 0.78539816F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 828
		bodyModel[272].setRotationPoint(36F, -17F, 15.3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 829
		bodyModel[273].setRotationPoint(34F, -14.93F, 15.3F);
		bodyModel[273].rotateAngleZ = 0.78539816F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 830
		bodyModel[274].setRotationPoint(36F, -17F, 11.3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 831
		bodyModel[275].setRotationPoint(34F, -14.93F, 11.3F);
		bodyModel[275].rotateAngleZ = 0.78539816F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 832
		bodyModel[276].setRotationPoint(30.6F, -20.4F, 5.6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 833
		bodyModel[277].setRotationPoint(30.6F, -20.4F, -4.4F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, 0.8F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, 0.8F, 0F, -0.35F); // Box 834
		bodyModel[278].setRotationPoint(30.3F, -20.3F, -4.4F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, 0.8F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, 0.8F, 0F, -0.35F); // Box 835
		bodyModel[279].setRotationPoint(30.3F, -20.3F, 5.6F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, 0.8F, 0F, -0.35F, 0.8F, 0F, -0.35F, 0.8F, 0F, -0.35F, 0.8F, 0F, -0.35F); // Box 836
		bodyModel[280].setRotationPoint(26.3F, -21.3F, -12F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F); // Box 837
		bodyModel[281].setRotationPoint(26.3F, -20.9F, -11.6F);

		bodyModel[282].addShapeBox(1F, 10F, -4F, 30, 1, 30, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F); // Box 902
		bodyModel[282].setRotationPoint(51.6F, -17.3F, -15.5F);
		bodyModel[282].rotateAngleX = 0.50614548F;
		bodyModel[282].rotateAngleY = 1.57079633F;

		bodyModel[283].addBox(-5.75F, -2F, -7F, 12, 3, 6, 0F); // Box 905
		bodyModel[283].setRotationPoint(-45.5F, -7.4F, -10.5F);

		bodyModel[284].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 906
		bodyModel[284].setRotationPoint(-45.5F, -8.4F, -10.5F);

		bodyModel[285].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 907
		bodyModel[285].setRotationPoint(-45.5F, -8.4F, 19F);

		bodyModel[286].addBox(-5.75F, -2F, -7F, 12, 3, 6, 0F); // Box 908
		bodyModel[286].setRotationPoint(-45.5F, -7.4F, 19F);


		turretModel = new ModelRendererTurbo[136];
		turretModel[0] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 559
		turretModel[1] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 561
		turretModel[2] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 562
		turretModel[3] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 563
		turretModel[4] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 564
		turretModel[5] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 565
		turretModel[6] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 566
		turretModel[7] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 570
		turretModel[8] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 572
		turretModel[9] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 573
		turretModel[10] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 574
		turretModel[11] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 576
		turretModel[12] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 577
		turretModel[13] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Box 578
		turretModel[14] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 579
		turretModel[15] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 580
		turretModel[16] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 581
		turretModel[17] = new ModelRendererTurbo(this, 233, 265, textureX, textureY); // Box 582
		turretModel[18] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 584
		turretModel[19] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Box 585
		turretModel[20] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Box 586
		turretModel[21] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 588
		turretModel[22] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 589
		turretModel[23] = new ModelRendererTurbo(this, 201, 313, textureX, textureY); // Box 590
		turretModel[24] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 592
		turretModel[25] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 593
		turretModel[26] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 594
		turretModel[27] = new ModelRendererTurbo(this, 481, 281, textureX, textureY); // Box 614
		turretModel[28] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 615
		turretModel[29] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 616
		turretModel[30] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 617
		turretModel[31] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 622
		turretModel[32] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 651
		turretModel[33] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 652
		turretModel[34] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 653
		turretModel[35] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 654
		turretModel[36] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Box 655
		turretModel[37] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box 656
		turretModel[38] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 657
		turretModel[39] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 658
		turretModel[40] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 659
		turretModel[41] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 660
		turretModel[42] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Box 661
		turretModel[43] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 662
		turretModel[44] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 663
		turretModel[45] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Box 664
		turretModel[46] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 665
		turretModel[47] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 666
		turretModel[48] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Box 667
		turretModel[49] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 669
		turretModel[50] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 670
		turretModel[51] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 671
		turretModel[52] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 672
		turretModel[53] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 673
		turretModel[54] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 674
		turretModel[55] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 675
		turretModel[56] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 676
		turretModel[57] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 677
		turretModel[58] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 685
		turretModel[59] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 686
		turretModel[60] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 687
		turretModel[61] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 688
		turretModel[62] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 689
		turretModel[63] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 690
		turretModel[64] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 691
		turretModel[65] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 692
		turretModel[66] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 693
		turretModel[67] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 694
		turretModel[68] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 695
		turretModel[69] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 696
		turretModel[70] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 697
		turretModel[71] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 698
		turretModel[72] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 699
		turretModel[73] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 700
		turretModel[74] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 701
		turretModel[75] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 702
		turretModel[76] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 703
		turretModel[77] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 704
		turretModel[78] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box 705
		turretModel[79] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 706
		turretModel[80] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 707
		turretModel[81] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 708
		turretModel[82] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 710
		turretModel[83] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 711
		turretModel[84] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 712
		turretModel[85] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 713
		turretModel[86] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Box 714
		turretModel[87] = new ModelRendererTurbo(this, 393, 273, textureX, textureY); // Box 715
		turretModel[88] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 716
		turretModel[89] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 717
		turretModel[90] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 718
		turretModel[91] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Box 719
		turretModel[92] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 720
		turretModel[93] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 721
		turretModel[94] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 723
		turretModel[95] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 724
		turretModel[96] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Box 725
		turretModel[97] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 726
		turretModel[98] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 727
		turretModel[99] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 728
		turretModel[100] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 744
		turretModel[101] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 745
		turretModel[102] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 747
		turretModel[103] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 748
		turretModel[104] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 750
		turretModel[105] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 751
		turretModel[106] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 753
		turretModel[107] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 754
		turretModel[108] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 755
		turretModel[109] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 757
		turretModel[110] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 758
		turretModel[111] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 759
		turretModel[112] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 760
		turretModel[113] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 761
		turretModel[114] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 762
		turretModel[115] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 763
		turretModel[116] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Box 764
		turretModel[117] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 765
		turretModel[118] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 766
		turretModel[119] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 767
		turretModel[120] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 768
		turretModel[121] = new ModelRendererTurbo(this, 289, 313, textureX, textureY); // Box 769
		turretModel[122] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 770
		turretModel[123] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 771
		turretModel[124] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 772
		turretModel[125] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 774
		turretModel[126] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 775
		turretModel[127] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 776
		turretModel[128] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 777
		turretModel[129] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 778
		turretModel[130] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 779
		turretModel[131] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Box 780
		turretModel[132] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 781
		turretModel[133] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 782
		turretModel[134] = new ModelRendererTurbo(this, 337, 377, textureX, textureY); // Box 903
		turretModel[135] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 904

		turretModel[0].addShapeBox(-4F, 0F, 2F, 7, 11, 12, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 6.25F, 0F, 0F, 5.75F); // Box 559
		turretModel[0].setRotationPoint(0F, -34F, 0F);

		turretModel[1].addShapeBox(-10F, 0F, 2F, 6, 9, 12, 0F, 1.25F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.7F, 0.25F, 0F, 3.75F); // Box 561
		turretModel[1].setRotationPoint(0F, -34F, 0F);

		turretModel[2].addShapeBox(3F, 0F, 2F, 5, 11, 12, 0F, 0F, 1.25F, 1F, 0F, 1.25F, 1F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 6.25F); // Box 562
		turretModel[2].setRotationPoint(0F, -34F, 0F);

		turretModel[3].addShapeBox(3F, 0F, -14F, 5, 11, 14, 0F, 0F, 1F, -1.5F, 0F, 1F, -2.5F, 0F, 1.25F, 1F, 0F, 1.25F, 1F, 0F, 0F, 6F, 0F, 0F, 4.75F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 563
		turretModel[3].setRotationPoint(0F, -34F, 0F);

		turretModel[4].addShapeBox(-4F, 0F, -13F, 7, 11, 13, 0F, 0F, 1.25F, 1F, 0F, 1F, -0.5F, 0F, 1.25F, 1F, 0F, 1.25F, 2F, -2.75F, 0F, 7.5F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 564
		turretModel[4].setRotationPoint(0F, -34F, 0F);

		turretModel[5].addShapeBox(-10F, 0F, -14F, 6, 9, 16, 0F, 2.25F, 1.25F, 0.25F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 1.25F, 1.25F, 0F, 1.25F, 0F, 4.25F, 2.3F, 0F, 5.45F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 565
		turretModel[5].setRotationPoint(0F, -34F, 0F);

		turretModel[6].addShapeBox(-24.25F, 0F, 2F, 13, 9, 11, 0F, 0F, 1.25F, 3F, 0F, 1.25F, 0F, 1F, 0F, -0.25F, 0F, 0F, -3.1F, 0F, 0F, 3F, 0F, 0F, 0F, 1F, 0F, 4.75F, 0F, 0F, 2F); // Box 566
		turretModel[6].setRotationPoint(0F, -34F, 0F);

		turretModel[7].addShapeBox(-24.25F, 0F, -15F, 13, 9, 17, 0F, 0F, 0F, -4.5F, -1F, 1.25F, -0.75F, 0F, 1.25F, 0F, 0F, 1.25F, -3F, 0F, 0F, 0.75F, 0F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 570
		turretModel[7].setRotationPoint(0F, -34F, 0F);

		turretModel[8].addShapeBox(-36.25F, 0F, -4F, 12, 9, 17, 0F, -0.25F, 0.75F, -3F, 0F, 1.25F, -3F, 0F, 0F, -3.1F, -0.25F, 0F, -5.6F, -0.25F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -0.25F, 0F, -0.6F); // Box 572
		turretModel[8].setRotationPoint(0F, -34F, 0F);

		turretModel[9].addShapeBox(-36.25F, 0F, -15F, 12, 9, 17, 0F, -0.25F, 0F, -6.5F, 0F, 0F, -4.5F, 0F, 1.25F, -3F, -0.25F, 0.75F, -3F, -0.25F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, -3F, -0.25F, 0F, -3F); // Box 573
		turretModel[9].setRotationPoint(0F, -34F, 0F);

		turretModel[10].addShapeBox(8F, 0F, -14F, 8, 11, 14, 0F, 0F, 1F, -2.5F, 0F, -1.5F, -4F, 0F, -1.5F, 1F, 0F, 1.25F, 1F, 0F, 0F, 4.75F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 574
		turretModel[10].setRotationPoint(0F, -34F, 0F);

		turretModel[11].addShapeBox(8F, 0F, 2F, 8, 11, 13, 0F, 0F, 1.25F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -5.25F, 0F, 0F, -2.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 4F); // Box 576
		turretModel[11].setRotationPoint(0F, -34F, 0F);

		turretModel[12].addShapeBox(16F, 1.5F, -10F, 9, 5, 19, 0F, 0F, 0F, 0F, 0F, -3F, -1.75F, 0F, -3F, -2.75F, 0F, 0F, 0.74F, 0F, 0F, 3.03F, 1F, 0F, -0.25F, 1F, 0F, -2F, 0F, 0F, 3.65F); // Box 577
		turretModel[12].setRotationPoint(0F, -34F, 0F);

		turretModel[13].addShapeBox(16F, 6.5F, -10F, 9, 5, 19, 0F, 0F, 0F, 3.03F, 1F, 0F, -0.25F, 1F, 0F, -2F, 0F, 0F, 3.65F, 0F, -0.5F, 5.75F, 1F, -1.5F, 0F, 1F, -1.5F, -2F, 0F, -0.5F, 6.25F); // Box 578
		turretModel[13].setRotationPoint(0F, -34F, 0F);

		turretModel[14].addShapeBox(16F, 8.5F, -10F, 9, 3, 19, 0F, 0F, -2.5F, 5.75F, 1F, -1.5F, 0F, 1F, -1.5F, -2F, 0F, -2.5F, 6.25F, -1F, 1.75F, 1.03F, 0F, 0F, -4.25F, 0F, 0F, -6F, -1F, 1.75F, 1.65F); // Box 579
		turretModel[14].setRotationPoint(0F, -34F, 0F);

		turretModel[15].addShapeBox(8F, 11F, -10F, 8, 2, 25, 0F, 0F, 0F, 8.75F, 0F, 0F, 5.75F, 0F, 0F, 0.25F, 0F, 0F, 4F, 0F, 0.25F, 7F, 1F, 0.25F, 1F, 1F, 0.25F, -4.35F, 0F, 0.25F, 1.75F); // Box 580
		turretModel[15].setRotationPoint(0F, -34F, 0F);

		turretModel[16].addShapeBox(3F, 0F, -16F, 5, 2, 30, 0F, 0F, 0F, 4F, 0F, 0F, 2.75F, 0F, 0F, 5F, 0F, 0F, 6.25F, 0F, 0.25F, 2F, 0F, 0.25F, 1F, 0F, 0.25F, 2.75F, 0F, 0.25F, 4F); // Box 581
		turretModel[16].setRotationPoint(0F, -23F, 0F);

		turretModel[17].addShapeBox(-4F, 8F, -20.25F, 7, 2, 40, 0F, -2.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2.75F, 0.25F, -2F, 0F, 0.25F, -2.25F, 0F, 0.25F, -1.75F, 0F, 0.25F, -3F); // Box 582
		turretModel[17].setRotationPoint(0F, -31F, 0F);

		turretModel[18].addShapeBox(-11F, 8F, -20.25F, 7, 2, 40, 0F, 0F, 0F, -4F, 2.75F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.25F, -7F, 2.75F, 0.25F, -2F, 0F, 0.25F, -3F, 0F, 0.25F, -7F); // Box 584
		turretModel[18].setRotationPoint(0F, -31F, 0F);

		turretModel[19].addShapeBox(-19F, 8F, -20.25F, 4, 2, 40, 0F, 0.5F, 0F, -15.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0.5F, 0F, -16.5F, -1.5F, 0.25F, -18F, 0F, 0.25F, -12F, 0F, 0.25F, -12F, -1.5F, 0.25F, -19F); // Box 585
		turretModel[19].setRotationPoint(0F, -31F, 0F);

		turretModel[20].addShapeBox(-15F, 8F, -20.25F, 4, 2, 40, 0F, 0F, 0F, -8.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8.5F, 0F, 0.25F, -12F, 0F, 0.25F, -7F, 0F, 0.25F, -7F, 0F, 0.25F, -12F); // Box 586
		turretModel[20].setRotationPoint(0F, -31F, 0F);

		turretModel[21].addShapeBox(-19F, 5.75F, -20.25F, 4, 2, 40, 0F, 1.5F, 0F, -14.5F, -1F, 0F, -6.5F, -1F, 0F, -6.5F, 1.5F, 0F, -15.5F, 0.5F, 0.25F, -15.5F, 0F, 0.25F, -8.5F, 0F, 0.25F, -8.5F, 0.5F, 0.25F, -16.5F); // Box 588
		turretModel[21].setRotationPoint(0F, -31F, 0F);

		turretModel[22].addShapeBox(-15F, 5.75F, -20.25F, 4, 2, 40, 0F, 1F, 0F, -6.5F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, -6.5F, 0F, 0.25F, -8.5F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, -8.5F); // Box 589
		turretModel[22].setRotationPoint(0F, -31F, 0F);

		turretModel[23].addShapeBox(-11F, 6F, -20.25F, 7, 2, 40, 0F, 0F, 0F, -3.15F, 2.3F, 0F, -0.9F, 0F, 0F, -1.05F, 0F, 0F, -3.1F, 0F, 0F, -4F, 2.75F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 590
		turretModel[23].setRotationPoint(0F, -31F, 0F);

		turretModel[24].addShapeBox(-11F, 6F, -20.25F, 7, 2, 40, 0F, -7.5F, 0F, -1.05F, 2.3F, 0F, -0.8F, 0F, 0F, -1.05F, -0.75F, 0F, -2F, -9.7F, 0F, 0.25F, 2.75F, 0F, 0.25F, 0F, 0F, 0F, -1.75F, 0F, -1F); // Box 592
		turretModel[24].setRotationPoint(0F, -31F, 0F);

		turretModel[25].addShapeBox(17F, 1.9F, -8F, 8, 5, 14, 0F, 0F, 0F, 1F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 0F, 2.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F); // Box 593
		turretModel[25].setRotationPoint(0F, -34.25F, 0F);

		turretModel[26].addShapeBox(-43F, 0F, -8F, 7, 9, 15, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, 3F, 0F, -0.3F, 4.75F, 0F, -0.3F, 4.75F, 0F, -0.3F, 3F); // Box 594
		turretModel[26].setRotationPoint(0F, -34F, 0F);

		turretModel[27].addShapeBox(-6F, 0.5F, 4F, 3, 10, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 614
		turretModel[27].setRotationPoint(0F, -36.25F, 0F);
		turretModel[27].rotateAngleX = -0.05235988F;

		turretModel[28].addShapeBox(-3F, 0.5F, 4F, 3, 10, 9, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 615
		turretModel[28].setRotationPoint(0F, -36.25F, 0F);
		turretModel[28].rotateAngleX = -0.05235988F;

		turretModel[29].addShapeBox(0F, 0.5F, 4F, 1, 10, 9, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 616
		turretModel[29].setRotationPoint(0F, -36.25F, 0F);
		turretModel[29].rotateAngleX = -0.05235988F;

		turretModel[30].addShapeBox(-7F, 0.5F, 5.5F, 1, 10, 6, 0F, 0F, -0.3F, -2F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 617
		turretModel[30].setRotationPoint(0F, -36.25F, 0F);
		turretModel[30].rotateAngleX = -0.05235988F;

		turretModel[31].addShapeBox(0.5F, 0.5F, 5F, 1, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		turretModel[31].setRotationPoint(0F, -36.4F, 0F);
		turretModel[31].rotateAngleX = -0.05235988F;

		turretModel[32].addShapeBox(0.5F, 0.75F, 10F, 1, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		turretModel[32].setRotationPoint(0F, -36.4F, 0F);
		turretModel[32].rotateAngleX = -0.05235988F;

		turretModel[33].addShapeBox(-31.5F, -2F, -4F, 3, 9, 7, 0F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 652
		turretModel[33].setRotationPoint(0F, -34F, 0F);

		turretModel[34].addShapeBox(-29F, -2F, -4F, 3, 9, 7, 0F, -0.25F, 0F, 0.2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, 0.2F); // Box 653
		turretModel[34].setRotationPoint(0F, -34F, 0F);

		turretModel[35].addShapeBox(-34F, -2F, -4F, 3, 9, 7, 0F, -0.5F, 0F, -2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0F, -2F); // Box 654
		turretModel[35].setRotationPoint(0F, -34F, 0F);

		turretModel[36].addShapeBox(-7F, -3F, -9.85F, 3, 9, 8, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 655
		turretModel[36].setRotationPoint(0F, -34F, 0F);

		turretModel[37].addShapeBox(-11F, -3F, -9.85F, 4, 9, 8, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 656
		turretModel[37].setRotationPoint(0F, -34F, 0F);

		turretModel[38].addShapeBox(-14F, -3F, -9.85F, 3, 9, 8, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 657
		turretModel[38].setRotationPoint(0F, -34F, 0F);

		turretModel[39].addShapeBox(-12F, -5F, -12.5F, 6, 1, 13, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 658
		turretModel[39].setRotationPoint(0F, -30.75F, 0F);

		turretModel[40].addShapeBox(-17F, -5F, -12.5F, 5, 1, 13, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F); // Box 659
		turretModel[40].setRotationPoint(0F, -30.75F, 0F);

		turretModel[41].addShapeBox(-6F, -5F, -12.5F, 7, 1, 13, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F); // Box 660
		turretModel[41].setRotationPoint(0F, -30.75F, 0F);

		turretModel[42].addShapeBox(-2.75F, -3F, -9.85F, 3, 9, 8, 0F, 0F, 0F, 0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.75F); // Box 661
		turretModel[42].setRotationPoint(0F, -34F, 0F);

		turretModel[43].addShapeBox(-3.75F, -3F, -9.85F, 1, 9, 8, 0F, 0.25F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, 0F, -1F); // Box 662
		turretModel[43].setRotationPoint(0F, -34F, 0F);

		turretModel[44].addShapeBox(-6F, -4F, -8.85F, 3, 9, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 663
		turretModel[44].setRotationPoint(0F, -34F, 0F);

		turretModel[45].addShapeBox(-3.5F, -4F, -8.85F, 2, 9, 6, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F); // Box 664
		turretModel[45].setRotationPoint(0F, -34F, 0F);

		turretModel[46].addShapeBox(-5F, -5F, -8.35F, 2, 1, 5, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 665
		turretModel[46].setRotationPoint(0F, -34F, 0F);

		turretModel[47].addShapeBox(-3.9F, -5F, -8.35F, 1, 1, 5, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 666
		turretModel[47].setRotationPoint(0F, -34F, 0F);

		turretModel[48].addShapeBox(-5.75F, -6F, -8.85F, 3, 1, 6, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F); // Box 667
		turretModel[48].setRotationPoint(0F, -34F, 0F);

		turretModel[49].addShapeBox(-5.75F, -5.35F, -9.6F, 3, 4, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 669
		turretModel[49].setRotationPoint(0F, -34F, 0F);

		turretModel[50].addShapeBox(-5.75F, -5.35F, -3.1F, 3, 4, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 670
		turretModel[50].setRotationPoint(0F, -34F, 0F);

		turretModel[51].addShapeBox(4.25F, -3.75F, -11.3F, 3, 4, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 671
		turretModel[51].setRotationPoint(0F, -34F, 0F);

		turretModel[52].addShapeBox(4.25F, -3.75F, -4.8F, 3, 4, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 672
		turretModel[52].setRotationPoint(0F, -34F, 0F);

		turretModel[53].addShapeBox(4.25F, -4.4F, -10.55F, 3, 1, 6, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F); // Box 673
		turretModel[53].setRotationPoint(0F, -34F, 0F);

		turretModel[54].addShapeBox(6.1F, -3F, -10.1F, 1, 1, 5, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 674
		turretModel[54].setRotationPoint(0F, -34F, 0F);

		turretModel[55].addShapeBox(5F, -3F, -10.1F, 2, 1, 5, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 675
		turretModel[55].setRotationPoint(0F, -34F, 0F);

		turretModel[56].addShapeBox(4F, -2F, -10.6F, 3, 9, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 676
		turretModel[56].setRotationPoint(0F, -34F, 0F);

		turretModel[57].addShapeBox(6.5F, -2F, -10.6F, 2, 9, 6, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F); // Box 677
		turretModel[57].setRotationPoint(0F, -34F, 0F);

		turretModel[58].addShapeBox(5F, -0.8F, 7.8F, 3, 6, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 685
		turretModel[58].setRotationPoint(0F, -34F, 0F);

		turretModel[59].addShapeBox(6.1F, -1.8F, 7.7F, 2, 1, 4, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 686
		turretModel[59].setRotationPoint(0F, -34F, 0F);

		turretModel[60].addShapeBox(5F, -1.8F, 7.7F, 3, 1, 4, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 687
		turretModel[60].setRotationPoint(0F, -34F, 0F);

		turretModel[61].addShapeBox(5F, -1.2F, 4.8F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		turretModel[61].setRotationPoint(0F, -34F, 0F);

		turretModel[62].addShapeBox(2.2F, -0.8F, 11F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		turretModel[62].setRotationPoint(0F, -34F, 0F);

		turretModel[63].addShapeBox(-15.2F, -1.5F, 1.4F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		turretModel[63].setRotationPoint(0F, -34F, 0F);

		turretModel[64].addShapeBox(-16.5F, -1.8F, 7.25F, 2, 6, 2, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 691
		turretModel[64].setRotationPoint(0F, -34F, 0F);

		turretModel[65].addShapeBox(-16.5F, -4.8F, 7.25F, 2, 6, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 692
		turretModel[65].setRotationPoint(0F, -34F, 0F);

		turretModel[66].addShapeBox(-31.5F, -4.8F, 4.5F, 2, 6, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 693
		turretModel[66].setRotationPoint(0F, -34F, 0F);

		turretModel[67].addShapeBox(-31.5F, -1.8F, 4.5F, 2, 6, 2, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 694
		turretModel[67].setRotationPoint(0F, -34F, 0F);

		turretModel[68].addShapeBox(-31.5F, -12.8F, 4.5F, 2, 8, 2, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F); // Box 695
		turretModel[68].setRotationPoint(0F, -34F, 0F);

		turretModel[69].addShapeBox(-16.5F, -12.8F, 7.25F, 2, 9, 2, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F); // Box 696
		turretModel[69].setRotationPoint(0F, -34F, 0F);

		turretModel[70].addShapeBox(7F, -1.6F, 1.8F, 1, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		turretModel[70].setRotationPoint(0F, -34F, 0F);

		turretModel[71].addShapeBox(17F, 1.6F, 2.8F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 698
		turretModel[71].setRotationPoint(0F, -34F, 0F);

		turretModel[72].addShapeBox(17F, 1.6F, 4.8F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 699
		turretModel[72].setRotationPoint(0F, -34F, 0F);

		turretModel[73].addShapeBox(17F, 1.6F, 6.8F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 700
		turretModel[73].setRotationPoint(0F, -34F, 0F);

		turretModel[74].addShapeBox(17F, 1.6F, 0.8F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 701
		turretModel[74].setRotationPoint(0F, -34F, 0F);

		turretModel[75].addShapeBox(17F, 1.6F, -1.2F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 702
		turretModel[75].setRotationPoint(0F, -34F, 0F);

		turretModel[76].addShapeBox(17F, 1.6F, -3.2F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 703
		turretModel[76].setRotationPoint(0F, -34F, 0F);

		turretModel[77].addShapeBox(17F, 1.6F, -4.8F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 704
		turretModel[77].setRotationPoint(0F, -34F, 0F);

		turretModel[78].addShapeBox(17F, 1.6F, -6.8F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 705
		turretModel[78].setRotationPoint(0F, -34F, 0F);

		turretModel[79].addShapeBox(17F, 1.6F, -8.8F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 706
		turretModel[79].setRotationPoint(0F, -34F, 0F);

		turretModel[80].addShapeBox(19F, 2.2F, -8.8F, 1, 6, 1, 0F, -0.25F, -0.05F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 707
		turretModel[80].setRotationPoint(0F, -34F, 0F);

		turretModel[81].addShapeBox(22F, 3.2F, -8.4F, 1, 6, 1, 0F, -0.25F, -0.05F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 708
		turretModel[81].setRotationPoint(0F, -34F, 0F);

		turretModel[82].addShapeBox(24F, 3.9F, -8F, 1, 6, 1, 0F, -0.25F, -0.05F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 710
		turretModel[82].setRotationPoint(0F, -34F, 0F);

		turretModel[83].addShapeBox(24F, 3.9F, 5.2F, 1, 6, 1, 0F, -0.25F, -0.05F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 711
		turretModel[83].setRotationPoint(0F, -34F, 0F);

		turretModel[84].addShapeBox(22F, 3.2F, 5.8F, 1, 6, 1, 0F, -0.25F, -0.05F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 712
		turretModel[84].setRotationPoint(0F, -34F, 0F);

		turretModel[85].addShapeBox(19F, 2.2F, 6.4F, 1, 6, 1, 0F, -0.25F, -0.05F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 713
		turretModel[85].setRotationPoint(0F, -34F, 0F);

		turretModel[86].addShapeBox(15.5F, 1.2F, 1F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		turretModel[86].setRotationPoint(0F, -34F, 0F);

		turretModel[87].addShapeBox(15.5F, 1.2F, 4.6F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		turretModel[87].setRotationPoint(0F, -34F, 0F);

		turretModel[88].addShapeBox(15.5F, 1.2F, 7.6F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		turretModel[88].setRotationPoint(0F, -34F, 0F);

		turretModel[89].addShapeBox(15.5F, 1.2F, -2.4F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		turretModel[89].setRotationPoint(0F, -34F, 0F);

		turretModel[90].addShapeBox(15.5F, 1.2F, -5.4F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		turretModel[90].setRotationPoint(0F, -34F, 0F);

		turretModel[91].addShapeBox(15.5F, 1.2F, -9F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		turretModel[91].setRotationPoint(0F, -34F, 0F);

		turretModel[92].addShapeBox(15.75F, 1.8F, 9.2F, 1, 1, 1, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, 0.1F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0.1F, -0.3F, -0.15F, 0.4F); // Box 720
		turretModel[92].setRotationPoint(0F, -34F, 0F);

		turretModel[93].addShapeBox(16.1F, 3.9F, 10.2F, 1, 1, 1, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, 0.1F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0.1F, -0.3F, -0.15F, 0.4F); // Box 721
		turretModel[93].setRotationPoint(0F, -34F, 0F);

		turretModel[94].addShapeBox(16.7F, 6.3F, 11.25F, 1, 1, 1, 0F, -0.15F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, 0.1F, -0.3F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0.4F); // Box 723
		turretModel[94].setRotationPoint(0F, -34F, 0F);

		turretModel[95].addShapeBox(15.7F, 1.25F, -1.7F, 1, 5, 11, 0F, -0.3F, 0.05F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0.05F, 0.5F, 1.7F, 0F, 0.25F, 0.7F, 0F, 0.25F, 0.7F, 0F, 2.75F, -1.3F, 0F, 3F); // Box 724
		turretModel[95].setRotationPoint(0F, -33.75F, 0F);

		turretModel[96].addShapeBox(15.7F, 1.25F, -9.8F, 1, 5, 8, 0F, -0.3F, 0.05F, 0.5F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0.05F, 0.25F, -1.3F, 0F, 3F, 0.7F, 0F, 2.85F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F); // Box 725
		turretModel[96].setRotationPoint(0F, -33.75F, 0F);

		turretModel[97].addShapeBox(16.6F, 6.3F, -13F, 1, 1, 1, 0F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.3F, -0.15F, 0.4F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F); // Box 726
		turretModel[97].setRotationPoint(0F, -34F, 0F);

		turretModel[98].addShapeBox(16.1F, 3.9F, -11.7F, 1, 1, 1, 0F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.3F, -0.15F, 0.4F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F); // Box 727
		turretModel[98].setRotationPoint(0F, -34F, 0F);

		turretModel[99].addShapeBox(15.75F, 1.8F, -10.6F, 1, 1, 1, 0F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.3F, -0.15F, 0.4F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F); // Box 728
		turretModel[99].setRotationPoint(0F, -34F, 0F);

		turretModel[100].addShapeBox(-3.25F, -9.75F, 15F, 3, 1, 1, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.15F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.1F); // Box 744
		turretModel[100].setRotationPoint(0F, -21.35F, 0F);

		turretModel[101].addShapeBox(-3.25F, -4.75F, 17.75F, 3, 1, 1, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, -0.05F); // Box 745
		turretModel[101].setRotationPoint(0F, -21.35F, 0F);

		turretModel[102].addShapeBox(4.75F, -9.75F, 14.85F, 3, 1, 1, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, -1.15F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, -0.9F, 0.25F, -0.3F, 0F); // Box 747
		turretModel[102].setRotationPoint(0F, -21.35F, 0F);

		turretModel[103].addShapeBox(4.75F, -4.75F, 17.75F, 3, 1, 1, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, -1.15F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, -0.9F, 0.25F, -0.3F, 0F); // Box 748
		turretModel[103].setRotationPoint(0F, -21.35F, 0F);

		turretModel[104].addShapeBox(-25F, -5.75F, -15F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0.75F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 750
		turretModel[104].setRotationPoint(0F, -21.35F, 0F);

		turretModel[105].addShapeBox(2.75F, -8.75F, -16.5F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.5F, 0.25F, -0.3F, -1.15F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, -0.9F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, 0F); // Box 751
		turretModel[105].setRotationPoint(0F, -21.35F, 0F);

		turretModel[106].addShapeBox(-6F, -12.75F, -15.1F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.05F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 753
		turretModel[106].setRotationPoint(0F, -21.35F, 0F);

		turretModel[107].addShapeBox(2.75F, -12.75F, -14F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.5F, 0.25F, -0.3F, -1.15F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, -0.9F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, 0F); // Box 754
		turretModel[107].setRotationPoint(0F, -21.35F, 0F);

		turretModel[108].addShapeBox(-6F, -8.75F, -17.1F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.5F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 755
		turretModel[108].setRotationPoint(0F, -21.35F, 0F);

		turretModel[109].addShapeBox(-24F, -11.75F, -12F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.5F, 0.25F, -0.3F, 0.75F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 757
		turretModel[109].setRotationPoint(0F, -21.35F, 0F);

		turretModel[110].addShapeBox(-32F, -11.75F, -10.9F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.9F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F); // Box 758
		turretModel[110].setRotationPoint(0F, -21.35F, 0F);

		turretModel[111].addShapeBox(-32F, -5.75F, -14.25F, 3, 1, 1, 0F, 0.25F, -0.3F, -0.9F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 1F); // Box 759
		turretModel[111].setRotationPoint(0F, -21.35F, 0F);

		turretModel[112].addShapeBox(-33F, -11.5F, 12.75F, 21, 1, 1, 0F, 0F, -0.1F, 5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -4.5F, 0F, -0.1F, 5F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, -4F); // Box 760
		turretModel[112].setRotationPoint(0F, -21.35F, 0F);

		turretModel[113].addShapeBox(-14F, -11.5F, 12.8F, 3, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.2F); // Box 761
		turretModel[113].setRotationPoint(0F, -21.35F, 0F);

		turretModel[114].addShapeBox(-33.5F, -11.5F, 8.75F, 3, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.2F); // Box 762
		turretModel[114].setRotationPoint(0F, -21.35F, 0F);

		turretModel[115].addShapeBox(-33.5F, -9.5F, 9.75F, 3, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.2F); // Box 763
		turretModel[115].setRotationPoint(0F, -21.35F, 0F);

		turretModel[116].addShapeBox(-33F, -9.5F, 13.75F, 21, 1, 1, 0F, 0F, -0.1F, 5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -4.5F, 0F, -0.1F, 5F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, -4F); // Box 764
		turretModel[116].setRotationPoint(0F, -21.35F, 0F);

		turretModel[117].addShapeBox(-14F, -9.5F, 13.8F, 3, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.2F); // Box 765
		turretModel[117].setRotationPoint(0F, -21.35F, 0F);

		turretModel[118].addShapeBox(-26F, -6.5F, 15.75F, 12, 1, 1, 0F, 0F, -0.1F, 5F, 0F, -0.1F, 1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -3F, 0F, -0.1F, 5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2.5F); // Box 766
		turretModel[118].setRotationPoint(0F, -21.35F, 0F);

		turretModel[119].addShapeBox(-14F, -6.5F, 15.75F, 3, 1, 1, 0F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.2F); // Box 767
		turretModel[119].setRotationPoint(0F, -21.35F, 0F);

		turretModel[120].addShapeBox(-28.5F, -6.5F, 12.75F, 3, 1, 1, 0F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.75F, 0F, 0F, 0.2F); // Box 768
		turretModel[120].setRotationPoint(0F, -21.35F, 0F);

		turretModel[121].addShapeBox(-43.5F, 6F, -8F, 7, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		turretModel[121].setRotationPoint(0F, -34F, 0F);

		turretModel[122].addShapeBox(-43.75F, 6F, -9F, 1, 1, 2, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 770
		turretModel[122].setRotationPoint(0F, -34F, 0F);

		turretModel[123].addShapeBox(-43.75F, 6F, 6F, 1, 1, 2, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 771
		turretModel[123].setRotationPoint(0F, -34F, 0F);

		turretModel[124].addShapeBox(-43.25F, 0.4F, -1F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 772
		turretModel[124].setRotationPoint(0F, -33.75F, 0F);

		turretModel[125].addShapeBox(-43F, 0F, -8F, 7, 1, 15, 0F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, 0.8F, 0.1F, -0.3F, 0.7F, 0.1F, -0.3F, -0.3F); // Box 774
		turretModel[125].setRotationPoint(0F, -34F, 0F);

		turretModel[126].addShapeBox(-40F, 13.5F, 13.25F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		turretModel[126].setRotationPoint(0F, -34F, 0F);
		turretModel[126].rotateAngleX = 0.43633231F;
		turretModel[126].rotateAngleY = 0.20943951F;
		turretModel[126].rotateAngleZ = 0.01745329F;

		turretModel[127].addShapeBox(-40F, 12.5F, 13.25F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		turretModel[127].setRotationPoint(0F, -34F, 0F);
		turretModel[127].rotateAngleX = 0.43633231F;
		turretModel[127].rotateAngleY = 0.20943951F;
		turretModel[127].rotateAngleZ = 0.01745329F;

		turretModel[128].addShapeBox(-34F, 12.5F, 13.25F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		turretModel[128].setRotationPoint(0F, -34F, 0F);
		turretModel[128].rotateAngleX = 0.43633231F;
		turretModel[128].rotateAngleY = 0.20943951F;
		turretModel[128].rotateAngleZ = 0.01745329F;

		turretModel[129].addShapeBox(-39F, 12.5F, 13.25F, 5, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 778
		turretModel[129].setRotationPoint(0F, -34F, 0F);
		turretModel[129].rotateAngleX = 0.43633231F;
		turretModel[129].rotateAngleY = 0.20943951F;
		turretModel[129].rotateAngleZ = 0.01745329F;

		turretModel[130].addShapeBox(-39.75F, 13F, -17.5F, 1, 1, 3, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		turretModel[130].setRotationPoint(0F, -34F, 0F);
		turretModel[130].rotateAngleX = -0.43633231F;
		turretModel[130].rotateAngleY = -0.20943951F;
		turretModel[130].rotateAngleZ = 0.01745329F;

		turretModel[131].addShapeBox(-38.75F, 13F, -15F, 5, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 780
		turretModel[131].setRotationPoint(0F, -34F, 0F);
		turretModel[131].rotateAngleX = -0.43633231F;
		turretModel[131].rotateAngleY = -0.20943951F;
		turretModel[131].rotateAngleZ = 0.01745329F;

		turretModel[132].addShapeBox(-33.75F, 13F, -17.5F, 1, 1, 3, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		turretModel[132].setRotationPoint(0F, -34F, 0F);
		turretModel[132].rotateAngleX = -0.43633231F;
		turretModel[132].rotateAngleY = -0.20943951F;
		turretModel[132].rotateAngleZ = 0.01745329F;

		turretModel[133].addShapeBox(-39.75F, 14F, -17.75F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		turretModel[133].setRotationPoint(0F, -34F, 0F);
		turretModel[133].rotateAngleX = -0.43633231F;
		turretModel[133].rotateAngleY = -0.20943951F;
		turretModel[133].rotateAngleZ = 0.01745329F;

		turretModel[134].addShapeBox(-6.75F, -9.2F, 15.5F, 30, 30, 1, 0F, -11F, -11F, 0F, -11F, -11F, 2F, -11F, -11F, -1.25F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 2F, -11F, -11F, -1.25F, -11F, -11F, 0F); // Box 903
		turretModel[134].setRotationPoint(0F, -26.3F, 0F);
		turretModel[134].rotateAngleX = 0.4712389F;
		turretModel[134].rotateAngleY = -0.26179939F;

		turretModel[135].addShapeBox(-6.75F, -9.2F, -15.75F, 30, 30, 1, 0F, -11F, -11F, 0.5F, -11F, -11F, -0.25F, -11F, -11F, 0F, -11F, -11F, -0.25F, -11F, -11F, 1F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, -1.25F); // Box 904
		turretModel[135].setRotationPoint(0F, -26.3F, 0F);
		turretModel[135].rotateAngleX = -0.4712389F;
		turretModel[135].rotateAngleY = 0.26179939F;


		barrelModel = new ModelRendererTurbo[30];
		barrelModel[0] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Box 595
		barrelModel[1] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 596
		barrelModel[2] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 597
		barrelModel[3] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 599
		barrelModel[4] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 600
		barrelModel[5] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 602
		barrelModel[6] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 606
		barrelModel[7] = new ModelRendererTurbo(this, 353, 329, textureX, textureY); // Box 607
		barrelModel[8] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 608
		barrelModel[9] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 361
		barrelModel[10] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 362
		barrelModel[11] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 364
		barrelModel[12] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 612
		barrelModel[13] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 613
		barrelModel[14] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 614
		barrelModel[15] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 615
		barrelModel[16] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 616
		barrelModel[17] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Box 617
		barrelModel[18] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 618
		barrelModel[19] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 619
		barrelModel[20] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 620
		barrelModel[21] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 629
		barrelModel[22] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 630
		barrelModel[23] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 631
		barrelModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 633
		barrelModel[25] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 634
		barrelModel[26] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 635
		barrelModel[27] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 636
		barrelModel[28] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 637
		barrelModel[29] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 638

		barrelModel[0].addShapeBox(0F, -1.5F, -10.1F, 1, 3, 16, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F); // Box 595
		barrelModel[0].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[1].addShapeBox(0F, -4.5F, -10.1F, 1, 3, 16, 0F, 1.65F, -1F, 0.2F, -1.75F, -0.75F, 0F, -1.75F, -0.75F, 0F, 1.65F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F); // Box 596
		barrelModel[1].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[2].addShapeBox(0F, 1.5F, -6.1F, 1, 3, 8, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.9F, -1F, 0.2F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.9F, -1F, 0.2F); // Box 597
		barrelModel[2].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[3].addShapeBox(0F, 1.5F, -10.1F, 1, 3, 4, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.65F, -2F, 0.2F, -0.75F, -1.75F, 0F, -1F, -0.75F, 0F, 0.9F, -1F, 0.2F); // Box 599
		barrelModel[3].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[4].addShapeBox(0F, 1.5F, 1.9F, 1, 3, 4, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.9F, -1F, 0.2F, -1F, -0.75F, 0F, -0.75F, -1.75F, 0F, 0.65F, -2F, 0.2F); // Box 600
		barrelModel[4].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[5].addShapeBox(1F, -1.5F, -6.1F, 1, 3, 9, 0F, 1F, 1F, 0.2F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 1F, 1.2F, 1F, 1F, 0.2F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 1F, 1.2F); // Box 602
		barrelModel[5].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[6].addShapeBox(2F, -0.6F, -3.75F, 61, 1, 3, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 606
		barrelModel[6].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[7].addShapeBox(2F, -1.4F, -3.75F, 61, 1, 3, 0F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 607
		barrelModel[7].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[8].addShapeBox(2F, 0.2F, -3.75F, 61, 1, 3, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F); // Box 608
		barrelModel[8].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[9].addShapeBox(0F, -1.25F, -4.25F, 3, 2, 4, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 361
		barrelModel[9].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[10].addShapeBox(0F, -2.75F, -4.25F, 3, 2, 4, 0F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 362
		barrelModel[10].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[11].addShapeBox(0F, 0.25F, -4.25F, 3, 2, 4, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F); // Box 364
		barrelModel[11].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[12].addShapeBox(51F, -1.25F, -4.25F, 1, 2, 4, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 612
		barrelModel[12].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[13].addShapeBox(51F, -2.75F, -4.25F, 1, 2, 4, 0F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 613
		barrelModel[13].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[14].addShapeBox(51F, 0.25F, -4.25F, 1, 2, 4, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F); // Box 614
		barrelModel[14].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[15].addShapeBox(56F, -1.25F, -4.25F, 1, 2, 4, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 615
		barrelModel[15].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[16].addShapeBox(56F, -2.75F, -4.25F, 1, 2, 4, 0F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 616
		barrelModel[16].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[17].addShapeBox(56F, 0.25F, -4.25F, 1, 2, 4, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F); // Box 617
		barrelModel[17].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[18].addShapeBox(52F, -1.25F, -4.25F, 4, 2, 4, 0F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F); // Box 618
		barrelModel[18].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[19].addShapeBox(52F, -2.35F, -4.25F, 4, 2, 4, 0F, 0F, -0.6F, -1.45F, 0F, -0.6F, -1.45F, 0F, -0.6F, -1.45F, 0F, -0.6F, -1.45F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F); // Box 619
		barrelModel[19].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[20].addShapeBox(52F, -0.15F, -4.25F, 4, 2, 4, 0F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.6F, -1.45F, 0F, -0.6F, -1.45F, 0F, -0.6F, -1.45F, 0F, -0.6F, -1.45F); // Box 620
		barrelModel[20].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[21].addShapeBox(58.5F, -1.15F, -4.25F, 4, 2, 4, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 0F); // Box 629
		barrelModel[21].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[22].addShapeBox(58.5F, -2.25F, -4.25F, 4, 2, 4, 0F, -1.45F, -0.6F, 0F, -1.45F, -0.6F, 0.5F, -1.45F, -0.6F, 0.5F, -1.45F, -0.6F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 0F); // Box 630
		barrelModel[22].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[23].addShapeBox(58.5F, -0.0499999999999999F, -4.25F, 4, 2, 4, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 0F, -1.45F, -0.6F, 0F, -1.45F, -0.6F, 0.5F, -1.45F, -0.6F, 0.5F, -1.45F, -0.6F, 0F); // Box 631
		barrelModel[23].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[24].addShapeBox(2F, -1F, 0.6F, 1, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 633
		barrelModel[24].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[25].addShapeBox(3F, -1F, 0.6F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		barrelModel[25].setRotationPoint(26.5F, -26.4F, 1F);

		barrelModel[26].addShapeBox(-0.5F, -1.5F, -8F, 2, 3, 2, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 635
		barrelModel[26].setRotationPoint(26.5F, -26.4F, 1F);
		barrelModel[26].rotateAngleZ = 0.17453293F;

		barrelModel[27].addShapeBox(-0.5F, -3F, -8F, 2, 2, 2, 0F, 0F, -0.85F, -0.8F, 0F, -0.85F, -0.8F, 0F, -0.85F, -0.8F, 0F, -0.85F, -0.8F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 636
		barrelModel[27].setRotationPoint(26.5F, -26.4F, 1F);
		barrelModel[27].rotateAngleZ = 0.17453293F;

		barrelModel[28].addShapeBox(-0.5F, 0.8F, -8F, 2, 2, 2, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.95F, -0.6F, 0F, -0.95F, -0.6F, 0F, -0.95F, -0.6F, 0F, -0.95F, -0.6F); // Box 637
		barrelModel[28].setRotationPoint(26.5F, -26.4F, 1F);
		barrelModel[28].rotateAngleZ = 0.17453293F;

		barrelModel[29].addShapeBox(-1F, -2.5F, -9.1F, 1, 5, 14, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F); // Box 638
		barrelModel[29].setRotationPoint(26.5F, -26.4F, 1F);


		leftTrackWheelModels = new ModelRendererTurbo[21];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 126
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 127
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 128
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 520
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 521
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 522
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 523
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 524
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 525
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 526
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 527
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 528
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 529
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 530
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 531
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 532
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 533
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 534
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 535
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 536
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 537

		leftTrackWheelModels[0].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 126
		leftTrackWheelModels[0].setRotationPoint(-19F, -0.4F, 27.25F);

		leftTrackWheelModels[1].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackWheelModels[1].setRotationPoint(-19F, -0.4F, 27.25F);

		leftTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 128
		leftTrackWheelModels[2].setRotationPoint(-19F, -0.4F, 27.25F);

		leftTrackWheelModels[3].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		leftTrackWheelModels[3].setRotationPoint(-32.5F, -0.4F, 27.25F);

		leftTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 521
		leftTrackWheelModels[4].setRotationPoint(-32.5F, -0.4F, 27.25F);

		leftTrackWheelModels[5].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 522
		leftTrackWheelModels[5].setRotationPoint(-32.5F, -0.4F, 27.25F);

		leftTrackWheelModels[6].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		leftTrackWheelModels[6].setRotationPoint(-5F, -0.4F, 27.25F);

		leftTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 524
		leftTrackWheelModels[7].setRotationPoint(-5F, -0.4F, 27.25F);

		leftTrackWheelModels[8].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 525
		leftTrackWheelModels[8].setRotationPoint(-5F, -0.4F, 27.25F);

		leftTrackWheelModels[9].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		leftTrackWheelModels[9].setRotationPoint(10F, -0.4F, 27.25F);

		leftTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 527
		leftTrackWheelModels[10].setRotationPoint(10F, -0.4F, 27.25F);

		leftTrackWheelModels[11].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 528
		leftTrackWheelModels[11].setRotationPoint(10F, -0.4F, 27.25F);

		leftTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		leftTrackWheelModels[12].setRotationPoint(24.5F, -0.4F, 27.25F);

		leftTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 530
		leftTrackWheelModels[13].setRotationPoint(24.5F, -0.4F, 27.25F);

		leftTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 531
		leftTrackWheelModels[14].setRotationPoint(24.5F, -0.4F, 27.25F);

		leftTrackWheelModels[15].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		leftTrackWheelModels[15].setRotationPoint(36.5F, -7.4F, 26.5F);

		leftTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 533
		leftTrackWheelModels[16].setRotationPoint(36.5F, -7.4F, 26.5F);

		leftTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 534
		leftTrackWheelModels[17].setRotationPoint(36.5F, -7.4F, 26.5F);

		leftTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		leftTrackWheelModels[18].setRotationPoint(-45.5F, -7.4F, 26.5F);

		leftTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 536
		leftTrackWheelModels[19].setRotationPoint(-45.5F, -7.4F, 26.5F);

		leftTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 537
		leftTrackWheelModels[20].setRotationPoint(-45.5F, -7.4F, 26.5F);


		rightTrackWheelModels = new ModelRendererTurbo[23];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 538
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 539
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 540
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 541
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 542
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 543
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 544
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 545
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 546
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 547
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 548
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 549
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 550
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 551
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 552
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 553
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 554
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 555
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 556
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 557
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 558
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 788
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Box 793

		rightTrackWheelModels[0].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 538
		rightTrackWheelModels[0].setRotationPoint(24.5F, -0.4F, -19.25F);

		rightTrackWheelModels[1].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		rightTrackWheelModels[1].setRotationPoint(24.5F, -0.4F, -19.25F);

		rightTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 540
		rightTrackWheelModels[2].setRotationPoint(24.5F, -0.4F, -19.25F);

		rightTrackWheelModels[3].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 541
		rightTrackWheelModels[3].setRotationPoint(10F, -0.4F, -19.25F);

		rightTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 542
		rightTrackWheelModels[4].setRotationPoint(10F, -0.4F, -19.25F);

		rightTrackWheelModels[5].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		rightTrackWheelModels[5].setRotationPoint(10F, -0.4F, -19.25F);

		rightTrackWheelModels[6].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		rightTrackWheelModels[6].setRotationPoint(-5F, -0.4F, -19.25F);

		rightTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 545
		rightTrackWheelModels[7].setRotationPoint(-5F, -0.4F, -19.25F);

		rightTrackWheelModels[8].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 546
		rightTrackWheelModels[8].setRotationPoint(-5F, -0.4F, -19.25F);

		rightTrackWheelModels[9].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		rightTrackWheelModels[9].setRotationPoint(-19F, -0.4F, -19.25F);

		rightTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 548
		rightTrackWheelModels[10].setRotationPoint(-19F, -0.4F, -19.25F);

		rightTrackWheelModels[11].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 549
		rightTrackWheelModels[11].setRotationPoint(-19F, -0.4F, -19.25F);

		rightTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		rightTrackWheelModels[12].setRotationPoint(-32.5F, -0.4F, -19.25F);

		rightTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 551
		rightTrackWheelModels[13].setRotationPoint(-32.5F, -0.4F, -19.25F);

		rightTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 552
		rightTrackWheelModels[14].setRotationPoint(-32.5F, -0.4F, -19.25F);

		rightTrackWheelModels[15].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		rightTrackWheelModels[15].setRotationPoint(36.5F, -7.4F, -18.75F);

		rightTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 554
		rightTrackWheelModels[16].setRotationPoint(36.5F, -7.4F, -18.75F);

		rightTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 555
		rightTrackWheelModels[17].setRotationPoint(36.5F, -7.4F, -18.75F);

		rightTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 6, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		rightTrackWheelModels[18].setRotationPoint(-45.5F, -7.4F, -18.75F);

		rightTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 6, 0F); // Box 557
		rightTrackWheelModels[19].setRotationPoint(-45.5F, -7.4F, -18.75F);

		rightTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 558
		rightTrackWheelModels[20].setRotationPoint(-45.5F, -7.4F, -18.75F);

		rightTrackWheelModels[21].addShapeBox(-6.75F, -2F, -9.75F, 1, 4, 11, 0F, -0.3F, 0.85F, -0.2F, 0.1F, 0.05F, -0.2F, 0.1F, 0.05F, -0.2F, -0.3F, 0.85F, -0.2F, -0.2F, 0.6F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.25F, 0.6F, -0.2F); // Box 788
		rightTrackWheelModels[21].setRotationPoint(-45.5F, -7.4F, -18.75F);

		rightTrackWheelModels[22].addShapeBox(-6.79F, -1.96F, -9.75F, 1, 4, 11, 0F, 0.1F, 0.05F, -0.2F, -0.3F, 0.85F, -0.2F, -0.3F, 0.85F, -0.2F, 0.1F, 0.05F, -0.2F, 0.1F, 0F, -0.2F, -0.2F, 0.6F, -0.2F, -0.25F, 0.6F, -0.2F, 0.1F, 0F, -0.2F); // Box 793
		rightTrackWheelModels[22].setRotationPoint(49.5F, -7.4F, -18.75F);


		leftTrackModel = new ModelRendererTurbo[11];
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 795
		leftTrackModel[1] = new ModelRendererTurbo(this, 145, 345, textureX, textureY); // Box 796
		leftTrackModel[2] = new ModelRendererTurbo(this, 473, 345, textureX, textureY); // Box 797
		leftTrackModel[3] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 798
		leftTrackModel[4] = new ModelRendererTurbo(this, 137, 361, textureX, textureY); // Box 799
		leftTrackModel[5] = new ModelRendererTurbo(this, 177, 361, textureX, textureY); // Box 800
		leftTrackModel[6] = new ModelRendererTurbo(this, 209, 361, textureX, textureY); // Box 801
		leftTrackModel[7] = new ModelRendererTurbo(this, 409, 361, textureX, textureY); // Box 802
		leftTrackModel[8] = new ModelRendererTurbo(this, 449, 361, textureX, textureY); // Box 803
		leftTrackModel[9] = new ModelRendererTurbo(this, 481, 361, textureX, textureY); // Box 804
		leftTrackModel[10] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 805

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 62, 1, 11, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F); // Box 795
		leftTrackModel[0].setRotationPoint(-34.5F, 5.6F, 18F);

		leftTrackModel[1].addShapeBox(-15.8F, -0.25F, 0F, 16, 1, 11, 0F, 0F, 0F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, 0F, 0F, -0.2F); // Box 796
		leftTrackModel[1].setRotationPoint(40.5F, -2.4F, 18F);
		leftTrackModel[1].rotateAngleZ = 0.55850536F;

		leftTrackModel[2].addShapeBox(-2.95F, -0.62F, 0F, 3, 1, 11, 0F, 0F, 0F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0.32F, -0.05F, -0.2F, 0.5F, -0.05F, -0.2F, 0.5F, -0.05F, -0.2F, 0.32F, -0.05F, -0.2F); // Box 797
		leftTrackModel[2].setRotationPoint(42.9F, -4.55F, 18F);
		leftTrackModel[2].rotateAngleZ = 0.85521133F;

		leftTrackModel[3].addShapeBox(-6.79F, -1.96F, -9.75F, 1, 4, 11, 0F, 0.1F, 0.05F, -0.2F, -0.3F, 0.85F, -0.2F, -0.3F, 0.85F, -0.2F, 0.1F, 0.05F, -0.2F, 0.1F, 0F, -0.2F, -0.2F, 0.6F, -0.2F, -0.25F, 0.6F, -0.2F, 0.1F, 0F, -0.2F); // Box 798
		leftTrackModel[3].setRotationPoint(49.5F, -7.4F, 27.75F);

		leftTrackModel[4].addShapeBox(-4.6F, 4.75F, 0F, 5, 1, 11, 0F, 0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.3F, -0.1F, -0.2F, 0.05F, 0.15F, -0.2F, 0.05F, 0.15F, -0.2F, 0.3F, -0.1F, -0.2F); // Box 799
		leftTrackModel[4].setRotationPoint(46.55F, -13.8F, 18F);
		leftTrackModel[4].rotateAngleZ = -0.80285146F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.2F, 1.15F, -0.3F, -0.2F, 1.15F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 800
		leftTrackModel[5].setRotationPoint(37.5F, -14.4F, 18F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 85, 1, 11, 0F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 0.1F, -0.05F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, -0.05F, -0.2F); // Box 801
		leftTrackModel[6].setRotationPoint(-47.5F, -14.4F, 18F);

		leftTrackModel[7].addShapeBox(-5F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, -0.2F, 0.4F, 0.45F, -0.2F, 0.4F, 0.45F, -0.2F, 0F, 0F, -0.2F, 0F, 0.05F, -0.2F, 0.35F, -0.15F, -0.2F, 0.35F, -0.15F, -0.2F, 0F, 0.05F, -0.2F); // Box 802
		leftTrackModel[7].setRotationPoint(-48.45F, -13.8F, 18F);
		leftTrackModel[7].rotateAngleZ = 0.80285146F;

		leftTrackModel[8].addShapeBox(-6.75F, -2F, -9.75F, 1, 4, 11, 0F, -0.3F, 0.85F, -0.2F, 0.1F, 0.05F, -0.2F, 0.1F, 0.05F, -0.2F, -0.3F, 0.85F, -0.2F, -0.2F, 0.6F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.25F, 0.6F, -0.2F); // Box 803
		leftTrackModel[8].setRotationPoint(-45.5F, -7.4F, 27.75F);

		leftTrackModel[9].addShapeBox(-2.95F, -0.62F, 0F, 3, 1, 11, 0F, 0.4F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0.1F, -0.2F, 0.5F, 0F, -0.2F, 0.32F, -0.05F, -0.2F, 0.32F, -0.05F, -0.2F, 0.5F, 0F, -0.2F); // Box 804
		leftTrackModel[9].setRotationPoint(-49.5F, -2.4F, 18F);
		leftTrackModel[9].rotateAngleZ = -0.85521133F;

		leftTrackModel[10].addShapeBox(-16.75F, 0F, 0F, 17, 1, 11, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 805
		leftTrackModel[10].setRotationPoint(-34.5F, 5.6F, 18F);
		leftTrackModel[10].rotateAngleZ = -0.52359878F;


		rightTrackModel = new ModelRendererTurbo[9];
		rightTrackModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 207
		rightTrackModel[1] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 208
		rightTrackModel[2] = new ModelRendererTurbo(this, 257, 337, textureX, textureY); // Box 785
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 786
		rightTrackModel[4] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 787
		rightTrackModel[5] = new ModelRendererTurbo(this, 353, 337, textureX, textureY); // Box 790
		rightTrackModel[6] = new ModelRendererTurbo(this, 121, 337, textureX, textureY); // Box 791
		rightTrackModel[7] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 792
		rightTrackModel[8] = new ModelRendererTurbo(this, 457, 337, textureX, textureY); // Box 794

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 85, 1, 11, 0F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 0.1F, -0.05F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, -0.05F, -0.2F); // Box 207
		rightTrackModel[0].setRotationPoint(-47.5F, -14.4F, -28.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 62, 1, 11, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F); // Box 208
		rightTrackModel[1].setRotationPoint(-34.5F, 5.6F, -28.5F);

		rightTrackModel[2].addShapeBox(-16.75F, 0F, 0F, 17, 1, 11, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 785
		rightTrackModel[2].setRotationPoint(-34.5F, 5.6F, -28.5F);
		rightTrackModel[2].rotateAngleZ = -0.52359878F;

		rightTrackModel[3].addShapeBox(-2.95F, -0.62F, 0F, 3, 1, 11, 0F, 0.4F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0.1F, -0.2F, 0.5F, 0F, -0.2F, 0.32F, -0.05F, -0.2F, 0.32F, -0.05F, -0.2F, 0.5F, 0F, -0.2F); // Box 786
		rightTrackModel[3].setRotationPoint(-49.5F, -2.4F, -28.5F);
		rightTrackModel[3].rotateAngleZ = -0.85521133F;

		rightTrackModel[4].addShapeBox(-5F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, -0.2F, 0.4F, 0.45F, -0.2F, 0.4F, 0.45F, -0.2F, 0F, 0F, -0.2F, 0F, 0.05F, -0.2F, 0.35F, -0.15F, -0.2F, 0.35F, -0.15F, -0.2F, 0F, 0.05F, -0.2F); // Box 787
		rightTrackModel[4].setRotationPoint(-48.45F, -13.8F, -28.5F);
		rightTrackModel[4].rotateAngleZ = 0.80285146F;

		rightTrackModel[5].addShapeBox(-15.8F, -0.25F, 0F, 16, 1, 11, 0F, 0F, 0F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, 0F, 0F, -0.2F); // Box 790
		rightTrackModel[5].setRotationPoint(40.5F, -2.4F, -28.5F);
		rightTrackModel[5].rotateAngleZ = 0.55850536F;

		rightTrackModel[6].addShapeBox(-4.6F, 4.75F, 0F, 5, 1, 11, 0F, 0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.3F, -0.1F, -0.2F, 0.05F, 0.15F, -0.2F, 0.05F, 0.15F, -0.2F, 0.3F, -0.1F, -0.2F); // Box 791
		rightTrackModel[6].setRotationPoint(46.55F, -13.8F, -28.5F);
		rightTrackModel[6].rotateAngleZ = -0.80285146F;

		rightTrackModel[7].addShapeBox(-2.95F, -0.62F, 0F, 3, 1, 11, 0F, 0F, 0F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0.32F, -0.05F, -0.2F, 0.5F, -0.05F, -0.2F, 0.5F, -0.05F, -0.2F, 0.32F, -0.05F, -0.2F); // Box 792
		rightTrackModel[7].setRotationPoint(42.9F, -4.55F, -28.5F);
		rightTrackModel[7].rotateAngleZ = 0.85521133F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.2F, 1.15F, -0.3F, -0.2F, 1.15F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 794
		rightTrackModel[8].setRotationPoint(37.5F, -14.4F, -28.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	
  @Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].render(f5);
		}
		for(int i = 0; i < turretModel.length; i++)
		{
			turretModel[i].render(f5);
		}
		for(int i = 0; i < barrelModel.length; i++)
		{
			barrelModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackModel.length; i++)
		{
			leftTrackModel[i].render(f5);
		}
		for(int i = 0; i < rightTrackModel.length; i++)
		{
			rightTrackModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackWheelModels.length; i++)
		{
			leftTrackWheelModels[i].render(f5);
		}
		for(int i = 0; i < rightTrackWheelModels.length; i++)
		{
			rightTrackWheelModels[i].render(f5);
		}
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
	}
}
