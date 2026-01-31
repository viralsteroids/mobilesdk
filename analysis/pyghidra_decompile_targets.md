# PyGhidra decompile targets

## 0x027de380
Function: FUN_027de380 @ 027de380
```c

/* WARNING: Control flow encountered bad instruction data */

void FUN_027de380(void)

{
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


```

## 0x014099e0
Function: FUN_014099e0 @ 014099e0
```c

void FUN_014099e0(void)

{
  return;
}


```

## 0x02801674
Function: FUN_02801674 @ 02801674
```c

/* WARNING: Control flow encountered bad instruction data */

void FUN_02801674(void)

{
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


```

## 0x00c9448c
Function: FUN_00c9448c @ 00c9448c
```c

void FUN_00c9448c(long param_1)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  undefined8 *puVar5;
  bool bVar6;
  uint uVar7;
  uint uVar8;
  int iVar9;
  undefined8 *puVar10;
  long lVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined *puVar14;
  uint *puVar15;
  long lVar16;
  undefined8 extraout_x1;
  undefined4 uVar17;
  long *plVar18;
  undefined8 *extraout_x8;
  ulong in_x9;
  double *pdVar19;
  ulong in_x10;
  undefined8 *unaff_x19;
  undefined1 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x23;
  long lVar20;
  ulong unaff_x25;
  long lVar21;
  long unaff_x29;
  double dVar22;
  double dVar23;
  double dVar24;
  double dVar25;
  long in_stack_00000010;
  long in_stack_00000018;
  byte bStack0000000000000020;
  undefined7 uStack0000000000000021;
  undefined1 uStack0000000000000028;
  undefined7 uStack0000000000000029;
  undefined1 uStack0000000000000030;
  undefined2 uStack0000000000000031;
  undefined1 uStack0000000000000033;
  undefined4 uStack0000000000000034;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined *in_stack_00000058;
  long in_stack_00000060;
  undefined *in_stack_00000068;
  long in_stack_00000070;
  byte bStack0000000000000078;
  undefined7 uStack0000000000000079;
  double in_stack_00000080;
  long *in_stack_00000088;
  byte in_stack_00000090;
  undefined8 in_stack_000000a0;
  byte in_stack_000000a8;
  undefined8 in_stack_000000b8;
  double in_stack_000000c0;
  double in_stack_000000c8;
  undefined *in_stack_000000d0;
  int iStack00000000000000d8;
  int iStack00000000000000dc;
  int iStack00000000000000e0;
  uint uStack00000000000000e4;
  uint uStack00000000000000e8;
  int iStack00000000000000ec;
  undefined4 uStack00000000000000f0;
  undefined4 uStack00000000000000f4;
  undefined4 uStack00000000000000f8;
  undefined4 uStack00000000000000fc;
  undefined8 *in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  long in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined4 in_stack_00000130;
  double in_stack_00000140;
  double in_stack_00000148;
  long *in_stack_00000150;
  undefined8 *in_stack_00000160;
  undefined8 *in_stack_00000168;
  undefined8 *in_stack_00000170;
  undefined8 *in_stack_00000178;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  
  if (in_x9 == (in_x10 & 0xffffffffffff | 0x7273000000000000) && param_1 == 0x5f5f6372735f7275) {
LAB_00c945a8:
    lVar11 = func_0x00966274(unaff_x19 + 1,unaff_x21);
    in_stack_000000d0 = &UNK_0248d4c0;
    puVar10 = *(undefined8 **)(lVar11 + 0x30);
    in_stack_00000110 = 0;
    in_stack_00000118 = 0;
    in_stack_00000108 = 0;
    *(undefined8 *)(unaff_x20 + 0x50) = 0;
    *(undefined8 *)(unaff_x20 + 0x48) = 0;
    *(undefined8 *)(unaff_x20 + 0x60) = 0;
    *(undefined8 *)(unaff_x20 + 0x58) = 0;
    uStack00000000000000f8 = 0;
    uStack00000000000000fc = 0;
    in_stack_00000120 = 0;
    in_stack_00000128 = 0;
    in_stack_00000130 = 0;
    in_stack_00000100 = &stack0x00000108;
    uVar12 = func_0x0094684c(&stack0x000000d0);
    if ((uVar12 & 1) != 0) {
      uVar13 = func_0x02481390(0x10);
      func_0x02481900(uVar13,&UNK_00346266);
      if (*(long *)(in_stack_00000010 + 0x28) != *(long *)(unaff_x29 + -0x18)) goto LAB_00c95614;
      func_0x024813b0(uVar13,&_ZTIN2se6common21NotSupportedExceptionE,
                      _ZN2se6common13BaseExceptionD1Ev);
LAB_00c951d4:
      func_0x0093f2b0(&stack0x00000160);
      func_0x0093f398(&stack0x00000160,&UNK_002c0ace,9);
      func_0x0093f398(&stack0x00000160,&UNK_0036063b,0x2b);
      func_0x0093f398(&stack0x00000160,&UNK_0031c996,2);
      func_0x0093f398(&stack0x00000160,&UNK_002af87a,6);
      func_0x0093f398(&stack0x00000160,&UNK_002bbe1c,0xb1);
      func_0x0093f398(&stack0x00000160,&UNK_0030be7c,1);
      uVar13 = func_0x02481aa0(&stack0x00000160,0x75);
      uVar13 = func_0x0093f398(uVar13,&UNK_0031c996,2);
      uVar13 = func_0x0093f398(uVar13,&UNK_00317357,0x12);
      bStack0000000000000020 = 0x24;
      uStack0000000000000031 = 0x4e4f;
      uStack0000000000000029 = 0x54414c4f49565f;
      uStack0000000000000030 = 0x49;
      uStack0000000000000021 = 0x434152544e4f43;
      uStack0000000000000028 = 0x54;
      uStack0000000000000033 = 0;
      func_0x0093f71c(uVar13,&stack0x00000020);
      if ((bStack0000000000000020 & 1) != 0) {
        func_0x02480d30(CONCAT44(uStack0000000000000034,
                                 CONCAT13(uStack0000000000000033,
                                          CONCAT21(uStack0000000000000031,uStack0000000000000030))))
        ;
      }
      uVar13 = func_0x02481390(0x10);
      func_0x02481b70(&stack0x00000020,&stack0x00000168);
      func_0x02481bc0(uVar13,&stack0x00000020);
      if (*(long *)(in_stack_00000010 + 0x28) != *(long *)(unaff_x29 + -0x18)) goto LAB_00c95614;
      unaff_x21 = 0;
      func_0x024813b0(uVar13,&_ZTISt13runtime_error,_ZNSt14overflow_errorD2Ev);
      goto LAB_00c95318;
    }
    iVar9 = *(int *)(puVar10 + 2);
    if (iVar9 < 0) {
      uVar17 = 0xffffffff;
LAB_00c94f78:
      func_0x0093f2b0(&stack0x00000160);
      func_0x0093f398(&stack0x00000160,&UNK_002c0ace,9);
      func_0x0093f398(&stack0x00000160,&UNK_002b9fab,0x3d);
      func_0x0093f398(&stack0x00000160,&UNK_0031c996,2);
      func_0x0093f398(&stack0x00000160,&UNK_002af87a,6);
      func_0x0093f398(&stack0x00000160,&UNK_002bbe1c,0xb1);
      func_0x0093f398(&stack0x00000160,&UNK_0030be7c,1);
      unaff_x19 = (undefined8 *)func_0x02481aa0(&stack0x00000160,0x74);
      func_0x0093f398(unaff_x19,&UNK_0031c996,2);
      func_0x0093f398(unaff_x19,&UNK_00317357,0x12);
      func_0x0093f53c(&stack0x00000020,uVar17);
      func_0x0093f71c(unaff_x19,&stack0x00000020);
      if ((bStack0000000000000020 & 1) != 0) {
        func_0x02480d30(CONCAT44(uStack0000000000000034,
                                 CONCAT13(uStack0000000000000033,
                                          CONCAT21(uStack0000000000000031,uStack0000000000000030))))
        ;
      }
      uVar13 = func_0x02481390(0x10);
      func_0x02481b70(&stack0x00000020,&stack0x00000168);
      func_0x02481bc0(uVar13,&stack0x00000020);
      if (*(long *)(in_stack_00000010 + 0x28) != *(long *)(unaff_x29 + -0x18)) goto LAB_00c95614;
      unaff_x21 = 0;
      func_0x024813b0(uVar13,&_ZTISt13runtime_error,_ZNSt14overflow_errorD2Ev);
      goto LAB_00c95318;
    }
    uVar17 = 0xffffffff;
    iVar1 = *(int *)((long)puVar10 + 0xc);
    if (iVar1 < 0) goto LAB_00c94f78;
    uVar2 = *(uint *)((long)puVar10 + 0x14);
    unaff_x23 = (undefined8 *)(ulong)uVar2;
    if (((int)uVar2 < 1) || (iVar3 = *(int *)(puVar10 + 1), iVar3 == -1)) goto LAB_00c94f78;
    if (&stack0x000000d0 != (undefined **)puVar10) {
      uStack00000000000000f0 = 0;
      uStack00000000000000f4 = 0;
      uStack00000000000000f8 = 0;
      uStack00000000000000fc = 0;
      uStack00000000000000e8 = 0;
      iStack00000000000000ec = 0;
      iStack00000000000000d8 = iVar3;
      iStack00000000000000dc = iVar1;
      iStack00000000000000e0 = iVar9;
      uStack00000000000000e4 = uVar2;
      uVar7 = func_0x0244b168(iVar3);
      if ((int)uVar7 < 0x11) {
        uVar7 = 0x10;
      }
      uVar12 = (ulong)uVar7;
      uVar4 = -uVar7;
      uVar8 = func_0x0244b144(iVar3);
      uStack00000000000000e8 =
           (uVar7 + ((int)((uVar2 << (ulong)(uVar8 & 0x1f)) * iVar9 + 7) >> 3)) - 1 & uVar4;
      uVar2 = -uStack00000000000000e8;
      if (-1 < (int)uStack00000000000000e8) {
        uVar2 = uStack00000000000000e8;
      }
      unaff_x23 = (undefined8 *)(ulong)uVar2;
      lVar11 = func_0x02481c00(uVar12 + 0x13 + uVar12 + (long)iVar1 * (long)unaff_x23);
      if (lVar11 != 0) {
        plVar18 = (long *)(uVar12 + lVar11 & -uVar12);
        *(char *)((long)plVar18 + -1) = (char)plVar18 - (char)lVar11;
        if (plVar18 != (long *)0x0) {
          unaff_x20 = &stack0x00000090;
          *plVar18 = (long)plVar18 + (uVar12 + 0x13 & (ulong)uVar4);
          plVar18[1] = (long)unaff_x23;
          *(int *)(plVar18 + 2) = iStack00000000000000dc;
          iVar9 = 0;
          if (iStack00000000000000dc != 0) {
            iVar9 = iStack00000000000000dc + -1;
          }
          iStack00000000000000ec = 1;
          _uStack00000000000000f0 = (long)iVar9 * (long)unaff_x23;
          if (-1 < (int)uStack00000000000000e8) {
            _uStack00000000000000f0 = 0;
          }
          _uStack00000000000000f0 = *plVar18 + _uStack00000000000000f0;
          uStack00000000000000f8 = SUB84(plVar18,0);
          uStack00000000000000fc = (undefined4)((ulong)plVar18 >> 0x20);
          goto LAB_00c9470c;
        }
      }
      uVar17 = 0xfffffffe;
      unaff_x25 = (ulong)uVar4;
      goto LAB_00c94f78;
    }
LAB_00c9470c:
    iVar9 = func_0x022d4144(&stack0x000000d8,puVar10 + 1);
    if (iVar9 < 0) goto LAB_00c951d4;
    unaff_x23 = (undefined8 *)&stack0x00000078;
    lVar11 = func_0x00b14204(unaff_x25 + 0x20,&stack0x00000090);
    if (unaff_x25 + 0x28 == lVar11) {
      if ((bRam0000000002547b40 & 1) == 0) goto LAB_00c95318;
      in_stack_00000170 = (undefined8 *)0x254cc40;
      in_stack_00000168 = in_stack_00000170;
    }
    else {
      in_stack_00000170 = *(undefined8 **)(lVar11 + 0x38);
      in_stack_00000168 = (undefined8 *)(lVar11 + 0x40);
    }
  }
  else {
    puVar10 = (undefined8 *)func_0x00ae6624(unaff_x19 + 4,&stack0x000000a8);
    if (unaff_x19 + 5 == puVar10) {
      if ((bRam0000000002547b38 & 1) == 0) {
        iVar9 = func_0x02480d40(0x2547b38);
        if (iVar9 != 0) {
          uRam000000000254cc30 = 0;
          uRam000000000254cc28 = 0;
          uRam000000000254cc20 = 0x254cc28;
          func_0x02480d00(&UNK_00ae65e0,0x254cc20,&DAT_02485b30);
          func_0x02480d60(0x2547b38);
        }
        in_stack_00000170 = (undefined8 *)0x254cc28;
        unaff_x20 = &stack0x00000090;
        unaff_x23 = in_stack_00000170;
      }
      else {
        in_stack_00000170 = (undefined8 *)0x254cc28;
        unaff_x23 = in_stack_00000170;
      }
    }
    else {
      in_stack_00000170 = (undefined8 *)puVar10[7];
      unaff_x23 = puVar10 + 8;
    }
    in_stack_00000178 = unaff_x19 + 1;
    in_stack_00000160 = (undefined8 *)&UNK_0248d8b0;
    in_stack_00000168 = unaff_x23;
    while (puVar10 = (undefined8 *)(*(code *)*in_stack_00000160)(&stack0x00000160),
          in_stack_00000168 != puVar10) {
      unaff_x23 = (undefined8 *)(*(code *)in_stack_00000160[1])(&stack0x00000160);
      lVar11 = (*(code *)*in_stack_00000160)(&stack0x00000160);
      lVar11 = func_0x00966274(unaff_x23,*(undefined8 *)(lVar11 + 0x20));
      if (*(long *)(lVar11 + 0x40) == unaff_x21) {
        lVar11 = (*(code *)*in_stack_00000160)(&stack0x00000160);
        unaff_x21 = *(long *)(lVar11 + 0x20);
        goto LAB_00c945a8;
      }
      puVar10 = in_stack_00000170;
      puVar5 = (undefined8 *)in_stack_00000170[1];
      if ((undefined8 *)in_stack_00000170[1] == (undefined8 *)0x0) {
        do {
          in_stack_00000170 = (undefined8 *)puVar10[2];
          bVar6 = (undefined8 *)*in_stack_00000170 != puVar10;
          puVar10 = in_stack_00000170;
        } while (bVar6);
      }
      else {
        do {
          in_stack_00000170 = puVar5;
          puVar5 = (undefined8 *)*in_stack_00000170;
        } while ((undefined8 *)*in_stack_00000170 != (undefined8 *)0x0);
      }
    }
    uVar13 = func_0x02481390(0x10);
    unaff_x19 = &stack0x00000160;
    func_0x02481ff0(&stack0x00000160,&UNK_0031d64d,&stack0x000000a8);
    puVar10 = (undefined8 *)((ulong)unaff_x19 | 1);
    if (((ulong)in_stack_00000160 & 1) != 0) {
      puVar10 = in_stack_00000170;
    }
    func_0x02481960(uVar13,puVar10);
    if (*(long *)(in_stack_00000010 + 0x28) != *(long *)(unaff_x29 + -0x18)) goto LAB_00c95614;
    unaff_x21 = 0;
    func_0x024813b0(uVar13,&_ZTIN2se6common17InternalExceptionE,_ZN2se6common13BaseExceptionD1Ev);
LAB_00c95318:
    iVar9 = func_0x02480d40(0x2547b40);
    if (iVar9 != 0) {
      uRam000000000254cc48 = 0;
      uRam000000000254cc40 = 0;
      uRam000000000254cc38 = 0x254cc40;
      func_0x02480d00(&UNK_00b141fc,0x254cc38,&DAT_02485b30);
      func_0x02480d60(0x2547b40);
    }
    in_stack_00000170 = (undefined8 *)0x254cc40;
    unaff_x20 = &stack0x00000090;
    in_stack_00000168 = in_stack_00000170;
  }
  in_stack_00000178 = (undefined8 *)(unaff_x25 + 8);
  in_stack_00000160 = (undefined8 *)&UNK_024942b8;
  while( true ) {
    puVar10 = (undefined8 *)(*(code *)*in_stack_00000160)(&stack0x00000160);
    if (in_stack_00000168 == puVar10) break;
    uVar13 = (*(code *)in_stack_00000160[1])(&stack0x00000160);
    lVar11 = (*(code *)*in_stack_00000160)(&stack0x00000160);
    lVar11 = func_0x00aadcd8(uVar13,*(undefined8 *)(lVar11 + 0x20));
    plVar18 = *(long **)(lVar11 + 0x28);
    puVar14 = (undefined *)(**(code **)(*plVar18 + 0x20))(plVar18);
    if (puVar14 == &UNK_002bca5c) {
      lVar11 = func_0x00b95fa8(plVar18);
      lVar20 = *(long *)(lVar11 + 8);
      lVar21 = *(long *)(in_stack_00000018 + 8);
      if (lVar20 != lVar21) {
        while( true ) {
          lVar16 = func_0x00966274(unaff_x19 + 1,lVar20);
          if ((*(long *)(lVar16 + 0x38) == lVar20) || (lVar20 == lVar21)) break;
          lVar20 = func_0x00966274(unaff_x19 + 1,lVar20);
          lVar20 = *(long *)(lVar20 + 0x38);
        }
        if ((*(long *)(lVar16 + 0x38) == lVar20) && (lVar20 != lVar21)) goto LAB_00c9481c;
      }
      in_stack_00000070 = *(long *)(lVar11 + 0x18);
      in_stack_00000060 = lVar11 + 0x20;
      in_stack_00000058 = &UNK_02495f88;
      in_stack_00000068 = &UNK_02495f88;
      while( true ) {
        uVar12 = (**(code **)(in_stack_00000068 + 0x30))(&stack0x00000068,&stack0x00000058);
        if ((uVar12 & 1) != 0) break;
        puVar15 = (uint *)(**(code **)(*(long *)(in_stack_00000070 + 0x30) + 0x90))();
        if (*puVar15 == 0) {
          func_0x024814f0(&stack0x00000020);
        }
        else {
          func_0x02481520((long)**(double **)(puVar15 + 2),(long)(*(double **)(puVar15 + 2))[1],
                          &stack0x00000140);
          func_0x02481520((long)**(double **)(puVar15 + 2),(long)(*(double **)(puVar15 + 2))[1],
                          &stack0x000000c0);
          if (1 < (int)*puVar15) {
            lVar11 = (ulong)*puVar15 - 1;
            pdVar19 = (double *)(*(long *)(puVar15 + 2) + 0x18);
            dVar22 = in_stack_00000140;
            dVar23 = in_stack_00000148;
            dVar24 = in_stack_000000c8;
            dVar25 = in_stack_000000c0;
            do {
              in_stack_00000140 = (double)(long)pdVar19[-1];
              if (dVar22 <= (double)(long)pdVar19[-1]) {
                in_stack_00000140 = dVar22;
              }
              in_stack_00000148 = (double)(long)*pdVar19;
              if (dVar23 <= (double)(long)*pdVar19) {
                in_stack_00000148 = dVar23;
              }
              in_stack_000000c0 = (double)(long)pdVar19[-1];
              if ((double)(long)pdVar19[-1] <= dVar25) {
                in_stack_000000c0 = dVar25;
              }
              in_stack_000000c8 = (double)(long)*pdVar19;
              if ((double)(long)*pdVar19 <= dVar24) {
                in_stack_000000c8 = dVar24;
              }
              lVar11 = lVar11 + -1;
              pdVar19 = pdVar19 + 2;
              dVar22 = in_stack_00000140;
              dVar23 = in_stack_00000148;
              dVar24 = in_stack_000000c8;
              dVar25 = in_stack_000000c0;
            } while (lVar11 != 0);
          }
          func_0x02481500(&stack0x00000020,(int)in_stack_00000140,(int)in_stack_00000148,
                          (int)(in_stack_000000c0 - in_stack_00000140) + 1,
                          (int)(in_stack_000000c8 - in_stack_00000148) + 1);
        }
        in_stack_00000048 = CONCAT71(uStack0000000000000029,uStack0000000000000028);
        in_stack_00000040 = CONCAT71(uStack0000000000000021,bStack0000000000000020);
        func_0x00c9566c();
        (**(code **)(in_stack_00000068 + 0x38))(&stack0x00000068);
      }
    }
    else {
      puVar14 = (undefined *)(**(code **)(*plVar18 + 0x20))(plVar18);
      if (puVar14 == &UNK_002f3f83) {
        lVar11 = func_0x00b906e0(plVar18);
        lVar20 = *(long *)(lVar11 + 8);
        lVar21 = *(long *)(in_stack_00000018 + 8);
        if (lVar20 != lVar21) {
          while( true ) {
            lVar16 = func_0x00966274(unaff_x19 + 1,lVar20);
            if ((*(long *)(lVar16 + 0x38) == lVar20) || (lVar20 == lVar21)) break;
            lVar20 = func_0x00966274(unaff_x19 + 1,lVar20);
            lVar20 = *(long *)(lVar20 + 0x38);
          }
          if ((*(long *)(lVar16 + 0x38) == lVar20) && (lVar20 != lVar21)) goto LAB_00c9481c;
        }
        in_stack_00000070 = *(long *)(lVar11 + 0x18);
        in_stack_00000060 = lVar11 + 0x20;
        in_stack_00000068 = &UNK_02499ed8;
        in_stack_00000058 = &UNK_02499ed8;
        while( true ) {
          uVar12 = (**(code **)(in_stack_00000068 + 0x30))(&stack0x00000068,&stack0x00000058);
          if ((uVar12 & 1) != 0) break;
          puVar15 = (uint *)(**(code **)(*(long *)(in_stack_00000070 + 0x30) + 0x90))();
          if (*puVar15 == 0) {
            func_0x024814f0(&stack0x00000020);
          }
          else {
            func_0x02481520((long)**(double **)(puVar15 + 2),(long)(*(double **)(puVar15 + 2))[1],
                            &stack0x00000140);
            func_0x02481520((long)**(double **)(puVar15 + 2),(long)(*(double **)(puVar15 + 2))[1],
                            &stack0x000000c0);
            if (1 < (int)*puVar15) {
              lVar11 = (ulong)*puVar15 - 1;
              pdVar19 = (double *)(*(long *)(puVar15 + 2) + 0x18);
              dVar22 = in_stack_00000140;
              dVar23 = in_stack_00000148;
              dVar24 = in_stack_000000c8;
              dVar25 = in_stack_000000c0;
              do {
                in_stack_00000140 = (double)(long)pdVar19[-1];
                if (dVar22 <= (double)(long)pdVar19[-1]) {
                  in_stack_00000140 = dVar22;
                }
                in_stack_00000148 = (double)(long)*pdVar19;
                if (dVar23 <= (double)(long)*pdVar19) {
                  in_stack_00000148 = dVar23;
                }
                in_stack_000000c0 = (double)(long)pdVar19[-1];
                if ((double)(long)pdVar19[-1] <= dVar25) {
                  in_stack_000000c0 = dVar25;
                }
                in_stack_000000c8 = (double)(long)*pdVar19;
                if ((double)(long)*pdVar19 <= dVar24) {
                  in_stack_000000c8 = dVar24;
                }
                lVar11 = lVar11 + -1;
                pdVar19 = pdVar19 + 2;
                dVar22 = in_stack_00000140;
                dVar23 = in_stack_00000148;
                dVar24 = in_stack_000000c8;
                dVar25 = in_stack_000000c0;
              } while (lVar11 != 0);
            }
            func_0x02481500(&stack0x00000020,(int)in_stack_00000140,(int)in_stack_00000148,
                            (int)(in_stack_000000c0 - in_stack_00000140) + 1,
                            (int)(in_stack_000000c8 - in_stack_00000148) + 1);
          }
          in_stack_00000048 = CONCAT71(uStack0000000000000029,uStack0000000000000028);
          in_stack_00000040 = CONCAT71(uStack0000000000000021,bStack0000000000000020);
          func_0x00c9566c();
          (**(code **)(in_stack_00000068 + 0x38))(&stack0x00000068);
        }
      }
    }
LAB_00c9481c:
    puVar10 = in_stack_00000170;
    puVar5 = (undefined8 *)in_stack_00000170[1];
    if ((undefined8 *)in_stack_00000170[1] == (undefined8 *)0x0) {
      do {
        in_stack_00000170 = (undefined8 *)puVar10[2];
        bVar6 = (undefined8 *)*in_stack_00000170 != puVar10;
        puVar10 = in_stack_00000170;
      } while (bVar6);
    }
    else {
      do {
        in_stack_00000170 = puVar5;
        puVar5 = (undefined8 *)*in_stack_00000170;
      } while ((undefined8 *)*in_stack_00000170 != (undefined8 *)0x0);
    }
  }
  dVar22 = (double)(ulong)(bStack0000000000000078 >> 1);
  if ((bStack0000000000000078 & 1) != 0) {
    dVar22 = in_stack_00000080;
  }
  if (dVar22 == 5.43472210425371e-323) {
    plVar18 = (long *)((ulong)unaff_x23 | 1);
    if ((bStack0000000000000078 & 1) != 0) {
      plVar18 = in_stack_00000088;
    }
    if (*plVar18 != 0x63616c706e695f5f || *(long *)((long)plVar18 + 3) != 0x5f5f6563616c706e)
    goto LAB_00c94c40;
    lVar11 = func_0x009668e8(unaff_x19 + 1,unaff_x21);
    uVar13 = func_0x00959b70(&stack0x000000d0);
    plVar18 = *(long **)(lVar11 + 0x30);
    *(undefined8 *)(lVar11 + 0x30) = uVar13;
    lVar11 = _uStack00000000000000f0;
    if (plVar18 != (long *)0x0) {
      (**(code **)(*plVar18 + 8))();
      lVar11 = _uStack00000000000000f0;
    }
  }
  else {
LAB_00c94c40:
    in_stack_00000160 = (undefined8 *)&UNK_02494bc8;
    in_stack_00000168 = (undefined8 *)&UNK_024e35c0;
    in_stack_00000170 = (undefined8 *)0x3ff0000000000000;
    *(undefined8 *)(unaff_x20 + 0x100) = 0;
    *(undefined8 *)(unaff_x20 + 0xf8) = 0;
    *(undefined8 *)(unaff_x20 + 0xf0) = 0;
    *(undefined8 *)(unaff_x20 + 0xe8) = 0;
    in_stack_000001a0 = 0;
    in_stack_00000198 = 0;
    in_stack_00000190 = 0x3ff0000000000000;
    in_stack_000001a8 = 0;
    in_stack_000001b0 = 0x3ff0000000000000;
    if ((bStack0000000000000078 & 1) == 0) {
      in_stack_00000140 = (double)CONCAT71(uStack0000000000000079,bStack0000000000000078);
      in_stack_00000148 = in_stack_00000080;
      in_stack_00000150 = in_stack_00000088;
    }
    else {
      func_0x009440f8(&stack0x00000140,in_stack_00000088);
    }
    uStack0000000000000030 = 0;
    uStack0000000000000031 = 0;
    uStack0000000000000033 = 0;
    uStack0000000000000034 = 0;
    in_stack_00000038 = 0;
    bStack0000000000000020 = 0xf8;
    uStack0000000000000021 = 0x24995;
    uStack0000000000000028 = SUB81(&stack0x00000030,0);
    uStack0000000000000029 = (undefined7)((ulong)&stack0x00000030 >> 8);
    func_0x00943bf0(&stack0x00000028,&stack0x00000030,&stack0x00000140,&stack0x00000140);
    func_0x00ae69f8(&stack0x000000c0,unaff_x19,&stack0x000000d0,unaff_x21,&stack0x00000160,
                    &stack0x00000020);
    bStack0000000000000020 = 0xf8;
    uStack0000000000000021 = 0x24995;
    func_0x00943a14(CONCAT44(uStack0000000000000034,
                             CONCAT13(uStack0000000000000033,
                                      CONCAT21(uStack0000000000000031,uStack0000000000000030))));
    lVar11 = _uStack00000000000000f0;
    if (((ulong)in_stack_00000140 & 1) != 0) {
      func_0x02480d30(in_stack_00000150);
      lVar11 = _uStack00000000000000f0;
    }
  }
  uVar2 = uStack00000000000000e4;
  iVar1 = iStack00000000000000e0;
  iVar9 = iStack00000000000000dc;
  in_stack_000000d0 = &UNK_0248d4c0;
  _uStack00000000000000f0 = lVar11;
  if (((((iStack00000000000000ec != 0) && (lVar11 != 0)) && (-1 < iStack00000000000000e0)) &&
      ((-1 < iStack00000000000000dc && (0 < (int)uStack00000000000000e4)))) &&
     (iStack00000000000000d8 != -1)) {
    uVar7 = func_0x0244b144();
    iVar3 = uVar2 << (ulong)(uVar7 & 0x1f);
    uVar7 = iVar1 * iVar3 + 7;
    uVar2 = -uStack00000000000000e8;
    if (-1 < (int)uStack00000000000000e8) {
      uVar2 = uStack00000000000000e8;
    }
    uVar12 = (ulong)uVar2;
    if ((int)uVar7 >> 3 <= (int)uVar2) {
      plVar18 = (long *)CONCAT44(uStack00000000000000fc,uStack00000000000000f8);
      if (plVar18 != (long *)0x0) {
        if ((plVar18[1] != uVar12) || (lVar20 = *plVar18, lVar20 == 0)) goto LAB_00c94e54;
        if ((int)uStack00000000000000e8 < 0) {
          iVar1 = 0;
          if (iVar9 != 0) {
            iVar1 = iVar9 + -1;
          }
          lVar11 = lVar11 + (long)(int)uStack00000000000000e8 * (long)iVar1;
LAB_00c94df0:
          lVar16 = (long)iVar3;
          lVar21 = 0;
          if (uVar12 != 0) {
            lVar21 = (lVar11 - lVar20) / (long)uVar12;
          }
          lVar20 = (lVar11 - lVar20) - lVar21 * uVar12;
          lVar11 = 0;
          if (lVar16 != 0) {
            lVar11 = (lVar20 * 8) / lVar16;
          }
          if ((((lVar20 * 8 - lVar11 * lVar16 != 0) || (lVar21 < 0)) || (lVar20 < 0)) ||
             (((long)(int)plVar18[2] < lVar21 + iVar9 ||
              ((long)uVar12 < lVar20 + ((long)((ulong)uVar7 << 0x20) >> 0x23))))) goto LAB_00c94e54;
        }
        else {
          if (uStack00000000000000e8 != 0) goto LAB_00c94df0;
          if ((iVar9 != 0 && iVar1 != 0) || (lVar11 != lVar20)) goto LAB_00c94e54;
        }
        func_0x02481bf0((long)plVar18 - (ulong)*(byte *)((long)plVar18 + -1));
      }
      uStack00000000000000f8 = 0;
      iStack00000000000000ec = 0;
      _uStack00000000000000f0 = 0;
      uStack00000000000000fc = 0;
    }
  }
LAB_00c94e54:
  if (in_stack_00000118 != 0) {
    in_stack_00000120 = in_stack_00000118;
    func_0x02480d30();
  }
  func_0x0095a3a8(in_stack_00000108);
  if ((bStack0000000000000078 & 1) != 0) {
    func_0x02480d30(in_stack_00000088);
  }
  if ((in_stack_00000090 & 1) != 0) {
    func_0x02480d30(in_stack_000000a0);
  }
  if ((in_stack_000000a8 & 1) == 0) {
    if (*(long *)(in_stack_00000010 + 0x28) == *(long *)(unaff_x29 + -0x18)) {
      return;
    }
  }
  else {
    func_0x02480d30(in_stack_000000b8);
    if (*(long *)(in_stack_00000010 + 0x28) == *(long *)(unaff_x29 + -0x18)) {
      return;
    }
  }
LAB_00c95614:
  func_0x02484b10();
  uVar13 = func_0x02480d90(0x18);
  func_0x00c94178(uVar13,extraout_x1);
  *extraout_x8 = uVar13;
  return;
}


```

## 0x01309f00
Function: FUN_01309f00 @ 01309f00
```c

/* WARNING: Possible PIC construction at 0x01309f0c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x01309f84: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x01309f88) */

void FUN_01309f00(ulong param_1)

{
  byte bVar1;
  undefined8 *puVar2;
  long unaff_x24;
  long unaff_x29;
  undefined8 in_stack_000000d0;
  
  if ((param_1 & 1) == 0) {
    if (*(long *)(unaff_x24 + 0x28) == *(long *)(unaff_x29 + -0x18)) {
      func_0x0084aa6c();
    }
    puVar2 = (undefined8 *)func_0x02484b10();
    *puVar2 = &UNK_024a54b0;
    if ((*(byte *)(puVar2 + 7) & 1) == 0) {
      bVar1 = *(byte *)(puVar2 + 4);
    }
    else {
      func_0x02480d30(puVar2[9]);
      bVar1 = *(byte *)(puVar2 + 4);
    }
    if ((bVar1 & 1) == 0) {
      if ((*(byte *)(puVar2 + 1) & 1) == 0) {
        return;
      }
      in_stack_000000d0 = puVar2[3];
    }
    else {
      in_stack_000000d0 = puVar2[6];
    }
  }
  _ZdlPv(in_stack_000000d0);
  return;
}


```